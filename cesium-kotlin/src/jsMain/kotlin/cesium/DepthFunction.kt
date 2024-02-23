// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
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
 * Determines the function used to compare two depths for the depth test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#DepthFunction">Online Documentation</a>
 */
sealed external interface DepthFunction {
companion object {

/**
 * The depth test never passes.
 */
val NEVER: DepthFunction

/**
 * The depth test passes if the incoming depth is less than the stored depth.
 */
val LESS: DepthFunction

/**
 * The depth test passes if the incoming depth is equal to the stored depth.
 */
val EQUAL: DepthFunction

/**
 * The depth test passes if the incoming depth is less than or equal to the stored depth.
 */
val LESS_OR_EQUAL: DepthFunction

/**
 * The depth test passes if the incoming depth is greater than the stored depth.
 */
val GREATER: DepthFunction

/**
 * The depth test passes if the incoming depth is not equal to the stored depth.
 */
val NOT_EQUAL: DepthFunction

/**
 * The depth test passes if the incoming depth is greater than or equal to the stored depth.
 */
val GREATER_OR_EQUAL: DepthFunction

/**
 * The depth test always passes.
 */
val ALWAYS: DepthFunction
}
}