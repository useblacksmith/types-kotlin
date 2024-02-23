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
 * The culling volume defined by planes.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CullingVolume.html">Online Documentation</a>
 * 
 * @constructor
 * @property [planes] An array of clipping planes.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CullingVolume.html">Online Documentation</a>
 */
external  class CullingVolume ( var planes: ReadonlyArray<Cartesian4> = definedExternally)  {
/**
 * Determines whether a bounding volume intersects the culling volume.
 * @param [boundingVolume] The bounding volume whose intersection with the culling volume is to be tested.
 * @return Intersect.OUTSIDE, Intersect.INTERSECTING, or Intersect.INSIDE.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CullingVolume.html#computeVisibility">Online Documentation</a>
 */
 fun computeVisibility ( boundingVolume: Any): Intersect

companion object  {
/**
 * Constructs a culling volume from a bounding sphere. Creates six planes that create a box containing the sphere.
 * The planes are aligned to the x, y, and z axes in world coordinates.
 * @param [boundingSphere] The bounding sphere used to create the culling volume.
 * @param [result] The object onto which to store the result.
 * @return The culling volume created from the bounding sphere.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CullingVolume.html#.fromBoundingSphere">Online Documentation</a>
 */
 fun fromBoundingSphere (
 boundingSphere: BoundingSphere,
 result: CullingVolume? = definedExternally
): CullingVolume
}
}
