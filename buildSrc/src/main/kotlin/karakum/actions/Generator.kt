package karakum.actions

import karakum.common.GENERATOR_COMMENT
import karakum.common.Suppress
import karakum.common.fileSuppress
import java.io.File

private val DEFAULT_IMPORTS = """
import kotlin.js.Promise
import js.core.Record
import js.core.ReadonlyArray
import js.core.Void
import js.errors.JsError
import node.buffer.Buffer
import node.http.IncomingHttpHeaders
import node.http.OutgoingHttpHeaders
import web.url.URL

import actions.http.client.HttpClientResponse
""".trimIndent()

fun generateKotlinDeclarations(
    definitionsDir: File,
    sourceDir: File,
) {
    definitionsDir.listFiles()!!
        .filter { it.isDirectory }
        .forEach { dir ->
            generate(
                definitionsDir = dir,
                sourceDir = sourceDir,
            )
        }
}

private fun generate(
    definitionsDir: File,
    sourceDir: File,
) {
    val library = Library(definitionsDir.name)
    val files = sequenceOf("lib", "lib/internal")
        .map { definitionsDir.resolve(it) }
        .filter { it.exists() }
        .mapNotNull { it.listFiles { file -> file.name.endsWith(".d.ts") } }
        .flatMap { it.asSequence() }
        .toList()

    val dir = sourceDir.resolve(library.path)
        .also { it.mkdirs() }

    val results = files.asSequence()
        .flatMap { convert(it.readText()) }
        .toList()
        .mergeDuplicated()
        .removeDuplicatedInterfaces()

    for ((name, body) in results) {
        val suppresses = mutableListOf<Suppress>().apply {
            if ("JsName(\"\"\"(" in body)
                add(Suppress.NAME_CONTAINS_ILLEGAL_CHARS)
        }.toTypedArray()

        val annotations = when {
            "external class " in body
                    || "external val " in body
                    || "external fun " in body
            -> """@file:JsModule("${library.moduleId}")"""

            suppresses.isNotEmpty()
            -> fileSuppress(*suppresses)

            else -> ""
        }

        val finalBody = fileContent(
            annotations = annotations,
            body = body,
            pkg = library.pkg,
        )

        val fileName = if ("external val " in body) {
            "$name.val.kt"
        } else {
            "$name.kt"
        }

        var f = dir.resolve(fileName)
        check(!f.exists()) {
            "File $f already exists!"
        }

        f.writeText(finalBody)
    }
}

private fun fileContent(
    annotations: String = "",
    body: String,
    pkg: String,
): String {
    var result = sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        "package $pkg",
        DEFAULT_IMPORTS,
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    if (!result.endsWith("\n"))
        result += "\n"

    return result
}