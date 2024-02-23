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
 * Represents a burst of [Particle]s from a [ParticleSystem] at a given time in the systems lifetime.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleBurst.html">Online Documentation</a>
 */
external  class ParticleBurst ()  {
/**
 * The time in seconds after the beginning of the particle system's lifetime that the burst will occur.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleBurst.html#time">Online Documentation</a>
 */
var time: Double

/**
 * The minimum number of particles emitted.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleBurst.html#minimum">Online Documentation</a>
 */
var minimum: Double

/**
 * The maximum number of particles emitted.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleBurst.html#maximum">Online Documentation</a>
 */
var maximum: Double

/**
 * `true` if the burst has been completed; `false` otherwise.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/ParticleBurst.html#complete">Online Documentation</a>
 */
var complete: Boolean
}
inline fun ParticleBurst(
    block: ParticleBurst.() -> Unit
): ParticleBurst =
    ParticleBurst().apply(block)