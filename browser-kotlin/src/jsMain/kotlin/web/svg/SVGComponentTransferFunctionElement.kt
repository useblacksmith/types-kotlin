// Automatically generated - do not modify!

package web.svg

import web.dom.Element
import web.svg.SVGElement

/**
 * A base interface used by the component transfer function interfaces.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGComponentTransferFunctionElement)
 */
sealed external class SVGComponentTransferFunctionElement :
SVGElement {
val amplitude: SVGAnimatedNumber
val exponent: SVGAnimatedNumber
val intercept: SVGAnimatedNumber
val offset: SVGAnimatedNumber
val slope: SVGAnimatedNumber
val tableValues: SVGAnimatedNumberList
val type: SVGAnimatedEnumeration<Type>
val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Type
val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Type
val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Type
val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Type
val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Type
val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Type
companion object {
val SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN: Type
val SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY: Type
val SVG_FECOMPONENTTRANSFER_TYPE_TABLE: Type
val SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE: Type
val SVG_FECOMPONENTTRANSFER_TYPE_LINEAR: Type
val SVG_FECOMPONENTTRANSFER_TYPE_GAMMA: Type
}
sealed interface Type
}
