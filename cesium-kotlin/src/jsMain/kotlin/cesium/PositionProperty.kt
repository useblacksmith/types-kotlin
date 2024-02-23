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
 * The interface for all [Property] objects that define a world
 * location as a [Cartesian3] with an associated [ReferenceFrame].
 * This type defines an interface and cannot be instantiated directly.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionProperty.html">Online Documentation</a>
 */
external abstract  class PositionProperty ()  {
/**
 * Gets a value indicating if this property is constant.  A property is considered
 * constant if getValue always returns the same result for the current definition.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionProperty.html#isConstant">Online Documentation</a>
 */
abstract val isConstant: Boolean

/**
 * Gets the event that is raised whenever the definition of this property changes.
 * The definition is considered to have changed if a call to getValue would return
 * a different result for the same time.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionProperty.html#definitionChanged">Online Documentation</a>
 */
abstract val definitionChanged: DefaultEvent

/**
 * Gets the reference frame that the position is defined in.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionProperty.html#referenceFrame">Online Documentation</a>
 */
abstract var referenceFrame: ReferenceFrame

/**
 * Gets the value of the property at the provided time in the fixed frame.
 * @param [time] The time for which to retrieve the value.
 * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
 * @return The modified result parameter or a new instance if the result parameter was not supplied.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionProperty.html#getValue">Online Documentation</a>
 */
abstract  fun getValue (
 time: JulianDate,
 result: Cartesian3? = definedExternally
): Cartesian3?

/**
 * Gets the value of the property at the provided time and in the provided reference frame.
 * @param [time] The time for which to retrieve the value.
 * @param [referenceFrame] The desired referenceFrame of the result.
 * @param [result] The object to store the value into, if omitted, a new instance is created and returned.
 * @return The modified result parameter or a new instance if the result parameter was not supplied.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/PositionProperty.html#getValueInReferenceFrame">Online Documentation</a>
 */
abstract  fun getValueInReferenceFrame (
 time: JulianDate,
 referenceFrame: ReferenceFrame,
 result: Cartesian3? = definedExternally
): Cartesian3?
}
