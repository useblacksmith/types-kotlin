// Automatically generated - do not modify!

package web.svg

import web.animations.Animation
import web.dom.Element
import web.dom.Node
import web.dom.NodeList
import web.dom.NodeListOf
import web.events.Event
import web.events.EventHandler
import web.geometry.DOMMatrix
import web.geometry.DOMMatrix2DInit
import web.geometry.DOMMatrixReadOnly
import web.geometry.DOMPoint
import web.geometry.DOMPointReadOnly
import web.geometry.DOMRect
import web.geometry.DOMRectReadOnly
import web.svg.SVGElement
import web.window.Window
import web.window.WindowEventHandlers

/**
 * Provides access to the properties of <svg> elements, as well as methods to manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix operations and the ability to control the time of redraw on visual rendering devices.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement)
 */
sealed external class SVGSVGElement :
SVGGraphicsElement,
SVGFitToViewBox,
WindowEventHandlers {
var currentScale: Float
val currentTranslate: DOMPointReadOnly
val height: SVGAnimatedLength
val width: SVGAnimatedLength
val x: SVGAnimatedLength
val y: SVGAnimatedLength
 fun animationsPaused(): Boolean
 fun checkEnclosure(
element: SVGElement,
rect: DOMRectReadOnly,
): Boolean
 fun checkIntersection(
element: SVGElement,
rect: DOMRectReadOnly,
): Boolean
 fun createSVGAngle(): SVGAngle
 fun createSVGLength(): SVGLength
 fun createSVGMatrix(): DOMMatrix
 fun createSVGNumber(): SVGNumber
 fun createSVGPoint(): DOMPoint
 fun createSVGRect(): DOMRect
 fun createSVGTransform(): SVGTransform
 fun createSVGTransformFromMatrix(matrix: DOMMatrix2DInit = definedExternally): SVGTransform
 fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly /* DOMMatrix2DInit */): SVGTransform
 fun deselectAll()
 fun getCurrentTime(): Float
 fun getElementById(elementId: String): Element
 fun getEnclosureList(
rect: DOMRectReadOnly,
referenceElement: SVGElement?,
): NodeListOf<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>
 fun getIntersectionList(
rect: DOMRectReadOnly,
referenceElement: SVGElement?,
): NodeListOf<SVGElement /* SVGCircleElement | SVGEllipseElement | SVGImageElement | SVGLineElement | SVGPathElement | SVGPolygonElement | SVGPolylineElement | SVGRectElement | SVGTextElement | SVGUseElement */>
 fun pauseAnimations()
 fun setCurrentTime(seconds: Float)
 fun unpauseAnimations()
}
