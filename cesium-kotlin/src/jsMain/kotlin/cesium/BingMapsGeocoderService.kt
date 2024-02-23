// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
"NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
 * Provides geocoding through Bing Maps.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html">Online Documentation</a>
 */
external  class BingMapsGeocoderService ( options: ConstructorOptions)  {
/**
 * @property [key] A key to use with the Bing Maps geocoding service
 * @property [culture] A Bing Maps [Culture Code](https://docs.microsoft.com/en-us/bingmaps/rest-services/common-parameters-and-types/supported-culture-codes) to return results in a specific culture and language.
 */
 interface ConstructorOptions {
var  key: String
var  culture: String?
}

/**
 * The URL endpoint for the Bing geocoder service
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#url">Online Documentation</a>
 */
val url: String

/**
 * The key for the Bing geocoder service
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#key">Online Documentation</a>
 */
val key: String

/**
 * Gets the credit to display after a geocode is performed. Typically this is used to credit
 * the geocoder service.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#credit">Online Documentation</a>
 */
val credit: Credit?

/**
 * @param [query] The query to be sent to the geocoder service
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/BingMapsGeocoderService.html#geocode">Online Documentation</a>
 */
 fun geocode ( query: String): Promise<ReadonlyArray<GeocoderService.Result>>
}
inline fun BingMapsGeocoderService(
     block: BingMapsGeocoderService.ConstructorOptions.() -> Unit,
): BingMapsGeocoderService =
    BingMapsGeocoderService(options = jso(block))