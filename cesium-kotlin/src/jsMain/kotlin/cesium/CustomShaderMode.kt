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
 * An enum describing how the [CustomShader] will be added to the
 * fragment shader. This determines how the shader interacts with the material.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CustomShaderMode">Online Documentation</a>
 */
sealed external interface CustomShaderMode {
companion object {

/**
 * The custom shader will be used to modify the results of the material stage
 * before lighting is applied.
 */
val MODIFY_MATERIAL: CustomShaderMode

/**
 * The custom shader will be used instead of the material stage. This is a hint
 * to optimize out the material processing code.
 */
val REPLACE_MATERIAL: CustomShaderMode
}
}