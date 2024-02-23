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
 * The type of a geometric primitive, i.e., points, lines, and triangles.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#PrimitiveType">Online Documentation</a>
 */
sealed external interface PrimitiveType {
companion object {

/**
 * Points primitive where each vertex (or index) is a separate point.
 */
val POINTS: PrimitiveType

/**
 * Lines primitive where each two vertices (or indices) is a line segment.  Line segments are not necessarily connected.
 */
val LINES: PrimitiveType

/**
 * Line loop primitive where each vertex (or index) after the first connects a line to
 * the previous vertex, and the last vertex implicitly connects to the first.
 */
val LINE_LOOP: PrimitiveType

/**
 * Line strip primitive where each vertex (or index) after the first connects a line to the previous vertex.
 */
val LINE_STRIP: PrimitiveType

/**
 * Triangles primitive where each three vertices (or indices) is a triangle.  Triangles do not necessarily share edges.
 */
val TRIANGLES: PrimitiveType

/**
 * Triangle strip primitive where each vertex (or index) after the first two connect to
 * the previous two vertices forming a triangle.  For example, this can be used to model a wall.
 */
val TRIANGLE_STRIP: PrimitiveType

/**
 * Triangle fan primitive where each vertex (or index) after the first two connect to
 * the previous vertex and the first vertex forming a triangle.  For example, this can be used
 * to model a cone or circle.
 */
val TRIANGLE_FAN: PrimitiveType
}
}