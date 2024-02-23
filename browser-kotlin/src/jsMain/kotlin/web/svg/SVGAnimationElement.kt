// Automatically generated - do not modify!

package web.svg

import web.animations.Animation
import web.dom.Element
import web.svg.SVGElement

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement)
 */
sealed external class SVGAnimationElement :
SVGElement,
SVGTests {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/targetElement)
 */
val targetElement: SVGElement?
 fun beginElement()
 fun beginElementAt(offset: Float)
 fun endElement()
 fun endElementAt(offset: Float)
 fun getCurrentTime(): Float
 fun getSimpleDuration(): Float
 fun getStartTime(): Float
}
