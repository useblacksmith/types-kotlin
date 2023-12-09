package karakum.browser

import java.io.File

internal val MARKER_DECLARATIONS = listOf(
    "MessageEventSource",

    "CanvasImageSource",
    "TexImageSource",
    "Transferable",

    "HTMLOrSVGImageElement",
    "HTMLOrSVGScriptElement",

    "OffscreenRenderingContext",
    "RenderingContext",

    "ReadableStreamReadResult<T>",
)

private val BASE_TYPES = listOf(
    "Blob",
)

// TODO: read from definitions
private val ALIASES = mapOf(
    "WindowProxy" to "Window",
)

internal object MarkerRegistry {
    private lateinit var map: Map<String, List<String>>

    fun fill(
        definitionFile: File,
    ) {
        val content = definitionFile.readText()
        map = MARKER_DECLARATIONS.asSequence()
            .flatMap { name -> findParentTypes(content = content, interfaceName = name) }
            .groupBy(keySelector = { it.first }, valueTransform = { it.second })
    }

    fun additionalParents(
        type: String,
    ): List<String>? =
        map[type]

    fun nonProcessedChildTypes(
        type: String,
    ): List<String> =
        BASE_TYPES.filter {
            val parentTypes = map[it]
            parentTypes != null && type in parentTypes
        }
}

private fun findParentTypes(
    content: String,
    interfaceName: String,
): Sequence<Pair<String, String>> =
    content.substringAfter("type $interfaceName = ", "")
        .substringBefore(";\n")
        .splitToSequence(" | ")
        .map { it.substringBefore("<") }
        .map { ALIASES[it] ?: it }
        .map { it to interfaceName }
