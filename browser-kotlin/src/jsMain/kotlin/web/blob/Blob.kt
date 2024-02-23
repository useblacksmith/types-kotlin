// Automatically generated - do not modify!

package web.blob

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.core.JsLong
import js.promise.Promise
import js.typedarrays.Uint8Array
import web.blob.Blob
import web.blob.BlobPart
import web.blob.BlobPropertyBag
import web.file.File
import web.streams.ReadableStream

/**
 * A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob)
 */
open external class Blob(
blobParts: ReadonlyArray<BlobPart> = definedExternally,
options: BlobPropertyBag = definedExternally,
) {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/size)
 */
val size: JsLong
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/type)
 */
val type: String
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer)
 */
 fun arrayBuffer(): Promise<ArrayBuffer>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/slice)
 */
 fun slice(
start: JsLong = definedExternally,
end: JsLong = definedExternally,
contentType: String = definedExternally,
): Blob
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/stream)
 */
 fun stream(): ReadableStream<Uint8Array>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text)
 */
 fun text(): Promise<String>
}
