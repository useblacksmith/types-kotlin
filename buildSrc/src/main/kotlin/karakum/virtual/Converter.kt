package karakum.virtual

import karakum.table.ConversionResult
import java.io.File

private val EXCLUDED_ITEMS = setOf(
    "Key",
)

internal data class ConversionResult(
    val name: String,
    val body: String,
)

internal fun convertDefinitions(
    definitionFile: File,
): Sequence<ConversionResult> =
    definitionFile.readText()
        .substringBefore("\n\nexport {")
        .replace("export declare ", "declare ")
        .replace("export interface ", "declare interface ")
        .replace("\ninterface ", "\ndeclare interface ")
        .splitToSequence("\ndeclare ")
        .drop(1)
        .map { it.removeSuffix(";") }
        .map { convertDefinition(it) }
        .filter { it.name !in EXCLUDED_ITEMS }

private fun convertDefinition(
    source: String,
): ConversionResult {
    val type = source.substringBefore(" ")
    val body = source.substringAfter(" ")

    return when (type) {
        "const" -> convertConst(body)
        "function" -> convertFunction(body)
        "type" -> convertType(body)
        "interface" -> convertInterface(body)
        "class" -> convertInterface(body)
        else -> TODO()
    }
}

private fun convertConst(
    source: String,
): ConversionResult {
    val name = source.substringBefore(":")
    val type = if (": {" in source) "object" else "val"

    val body = source.replace(": {", " {")
        .replace("\n    ", "\n    val ")
        .replace("Virtualizer<any, any>", "Virtualizer<*, *>")
        .replace("<any>", "<*>")
        .replace("number", "Int")
        .replace(" => void", " -> Unit")
        .replace(" => ", " -> ")

    val content = "external $type $body"
    return ConversionResult(name, content)
}

private fun convertFunction(
    source: String,
): ConversionResult {
    val name = source
        .substringBefore(" ")
        .substringBefore(":")
        .substringBefore("<")
        .substringBefore("(")

    val body = source.removePrefix(name)
        .replaceFirst("(", " $name(")
        .replace(" extends ", " : ")
        .replace(" => void", " -> Unit")
        .replace(" => ", " -> ")
        .replace(": string", ": String")
        .replace(": number", ": Int")
        .replace(": boolean", ": Boolean")
        .replace("?: any", ": Any = definedExternally")
        .replace(": void", "")

    return ConversionResult(name, "external fun " + body)
}

private fun convertType(
    source: String,
): ConversionResult =
    if (" = {\n" in source) {
        convertInterface(source)
    } else {
        convertTypealias(source)
    }

private fun convertTypealias(
    source: String,
): ConversionResult {
    val name = source
        .substringBefore(" ")
        .substringBefore(":")
        .substringBefore("<")
        .substringBefore("(")

    var declaration = source.substringBefore(" = ")
        .replace(" extends ", " : ")

    var body = source.substringAfter(" = ")
        .replace(" => ", " -> ")

    if (body == "{}")
        return ConversionResult(name, "external interface $declaration")

    if (" | " in body) {
        declaration = declaration.replace(": object>", "/* : Any */>")

        return ConversionResult(name, "external interface $declaration /* $body */")
    }

    body = body
        .replace("(...args: any) -> any", "Function<Unit>")
        .replace("string[]", "ReadonlyArray<String>")
        .replace("string", "String")
        .replace("boolean", "Boolean")
        .replace("number", "Int")
        .replace(": any", ": Any")
        .replace(" -> any", " -> Any")
        .replace(" -> unknown", " -> Any")
        .replace("<any>", "<*>")
        .replace(" -> void", " -> Unit")

    return ConversionResult(name, "typealias $declaration = $body")
}

private fun convertInterface(
    source: String,
): ConversionResult {
    val declaration = source.substringBefore(" {")
        .replace(" extends ", " : ")
    val name = declaration.substringBefore("<")

    val body = "{\n" + convertMembers(source.substringAfter(" {")) + "\n}\n"
    return ConversionResult(name, "external interface $declaration$body")
}

private fun convertMembers(
    source: String,
): String =
    source
        .removeSuffix("\n")
        .substringBeforeLast("\n}")
        .trimIndent()
        .splitToSequence("\n")
        .filter { !it.startsWith("private ") }
        .filter { !it.startsWith("_") }
        .map { it.removeSuffix(";") }
        .map { convertMember(it) }
        .joinToString("\n")

private fun convertMember(
    source: String,
): String {
    if (source.startsWith("("))
        return "    // TODO: support invoke\n    /* $source */"

    val optional = source.substringBefore(": ")
        .endsWith("?")

    val name = source.substringBefore(": ")
        .removeSuffix("?")

    var type = source.substringAfter(": ")
        .let { karakum.table.kotlinType(it, name) }

    if (optional) {
        type = if (type.startsWith("(")) {
            "($type)?"
        } else "$type?"
    }

    return "var $name: $type"
}
