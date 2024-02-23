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
 * Defines how per-feature colors set from the Cesium API or declarative styling blend with the source colors from
 * the original feature, e.g. glTF material or per-point color in the tile.
 * 
 * When `REPLACE` or `MIX` are used and the source color is a glTF material, the technique must assign the
 * `_3DTILESDIFFUSE` semantic to the diffuse color parameter. Otherwise only `HIGHLIGHT` is supported.
 * 
 * A feature whose color evaluates to white (1.0, 1.0, 1.0) is always rendered without color blending, regardless of the
 * tileset's color blend mode.
 * 
 * ```
 * "techniques": {
 *   "technique0": {
 *     "parameters": {
 *       "diffuse": {
 *         "semantic": "_3DTILESDIFFUSE",
 *         "type": 35666
 *       }
 *     }
 *   }
 * }
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Cesium3DTileColorBlendMode">Online Documentation</a>
 */
sealed external interface Cesium3DTileColorBlendMode {
companion object {

/**
 * Multiplies the source color by the feature color.
 */
val HIGHLIGHT: Cesium3DTileColorBlendMode

/**
 * Replaces the source color with the feature color.
 */
val REPLACE: Cesium3DTileColorBlendMode

/**
 * Blends the source color and feature color together.
 */
val MIX: Cesium3DTileColorBlendMode
}
}