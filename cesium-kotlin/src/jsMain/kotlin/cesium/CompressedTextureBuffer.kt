// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

import js.promise.Promise
import web.canvas.ImageData
import web.dom.Document
import web.dom.Element
import web.html.HTMLCanvasElement
import web.html.HTMLElement
import web.html.HTMLIFrameElement
import web.html.HTMLImageElement
import web.html.HTMLVideoElement
import web.xml.XMLDocument
import js.buffer.ArrayBuffer
import js.objects.jso
import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.core.Void
import js.errors.JsError
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array
import js.typedarrays.Uint16Array
import js.typedarrays.Uint8Array
import web.blob.Blob

/**
 * Describes a compressed texture and contains a compressed texture buffer.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompressedTextureBuffer.html">Online Documentation</a>
 * 
 * @constructor
 * @property [internalFormat] The pixel format of the compressed texture.
 * @property [pixelDatatype] The pixel datatype of the compressed texture.
 * @property [width] The width of the texture.
 * @property [height] The height of the texture.
 * @param [buffer] The compressed texture buffer.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompressedTextureBuffer.html">Online Documentation</a>
 */
external  class CompressedTextureBuffer (
 val internalFormat: PixelFormat,
 val pixelDatatype: PixelDatatype,
 val width: Double,
 val height: Double,
 buffer: Uint8Array
)  {
/**
 * The compressed texture buffer.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompressedTextureBuffer.html#bufferView">Online Documentation</a>
 */
val bufferView: Uint8Array

/**
 * Creates a shallow clone of this compressed texture buffer.
 * @return A shallow clone of the compressed texture buffer.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompressedTextureBuffer.html#clone">Online Documentation</a>
 */
 fun clone (): CompressedTextureBuffer

companion object  {
/**
 * Creates a shallow clone of a compressed texture buffer.
 * @param [object] The compressed texture buffer to be cloned.
 * @return A shallow clone of the compressed texture buffer.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CompressedTextureBuffer.html#.clone">Online Documentation</a>
 */
 fun clone ( obj: CompressedTextureBuffer): CompressedTextureBuffer
}
}
