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
 * Represents the position relative to the terrain.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#HeightReference">Online Documentation</a>
 */
sealed external interface HeightReference {
companion object {

/**
 * The position is absolute.
 */
val NONE: HeightReference

/**
 * The position is clamped to the terrain and 3D Tiles.
 */
val CLAMP_TO_GROUND: HeightReference

/**
 * The position height is the height above the terrain and 3D Tiles.
 */
val RELATIVE_TO_GROUND: HeightReference

/**
 * The position is clamped to terain.
 */
val CLAMP_TO_TERRAIN: HeightReference

/**
 * The position height is the height above terrain.
 */
val RELATIVE_TO_TERRAIN: HeightReference

/**
 * The position is clamped to 3D Tiles.
 */
val CLAMP_TO_3D_TILE: HeightReference

/**
 * The position height is the height above 3D Tiles.
 */
val RELATIVE_TO_3D_TILE: HeightReference
}
}