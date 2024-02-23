// Automatically generated - do not modify!

@file:JsModule("cesium")

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
 * This class implements an I3S Feature.
 * 
 * Do not construct this directly, instead access tiles through [I3SNode].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SFeature.html">Online Documentation</a>
 */
external sealed  class I3SFeature   {
/**
 * Gets the resource for the feature
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SFeature.html#resource">Online Documentation</a>
 */
val resource: Resource

/**
 * Gets the I3S data for this object.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/I3SFeature.html#data">Online Documentation</a>
 */
val data: Any
}
