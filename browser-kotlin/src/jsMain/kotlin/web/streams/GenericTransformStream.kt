// Automatically generated - do not modify!

@file:Suppress(
"NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.streams

import web.streams.GenericTransformStream
import web.streams.ReadableStream
import web.streams.WritableStream

sealed external interface GenericTransformStream {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/readable)
 */
val readable: ReadableStream<*>
get() = definedExternally
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/writable)
 */
val writable: WritableStream<*>
get() = definedExternally
}
