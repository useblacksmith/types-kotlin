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
 * Determines the action taken based on the result of the stencil test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#StencilOperation">Online Documentation</a>
 */
sealed external interface StencilOperation {
companion object {

/**
 * Sets the stencil buffer value to zero.
 */
val ZERO: StencilOperation

/**
 * Does not change the stencil buffer.
 */
val KEEP: StencilOperation

/**
 * Replaces the stencil buffer value with the reference value.
 */
val REPLACE: StencilOperation

/**
 * Increments the stencil buffer value, clamping to unsigned byte.
 */
val INCREMENT: StencilOperation

/**
 * Decrements the stencil buffer value, clamping to zero.
 */
val DECREMENT: StencilOperation

/**
 * Bitwise inverts the existing stencil buffer value.
 */
val INVERT: StencilOperation

/**
 * Increments the stencil buffer value, wrapping to zero when exceeding the unsigned byte range.
 */
val INCREMENT_WRAP: StencilOperation

/**
 * Decrements the stencil buffer value, wrapping to the maximum unsigned byte instead of going below zero.
 */
val DECREMENT_WRAP: StencilOperation
}
}