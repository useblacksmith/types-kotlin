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
 * A widget for displaying information or a description.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBox.html">Online Documentation</a>
 * 
 * @constructor
 * @property [container] The DOM element that will contain the widget.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBox.html">Online Documentation</a>
 */
external  class InfoBox ( var container: Element)  {
/**
 * Gets the view model.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBox.html#viewModel">Online Documentation</a>
 */
var viewModel: InfoBoxViewModel

/**
 * Gets the iframe used to display the description.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBox.html#frame">Online Documentation</a>
 */
var frame: HTMLIFrameElement

/**
 * @return true if the object has been destroyed, false otherwise.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBox.html#isDestroyed">Online Documentation</a>
 */
 fun isDestroyed (): Boolean

/**
 * Destroys the widget.  Should be called if permanently
 * removing the widget from layout.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/InfoBox.html#destroy">Online Documentation</a>
 */
 fun destroy ()
}
