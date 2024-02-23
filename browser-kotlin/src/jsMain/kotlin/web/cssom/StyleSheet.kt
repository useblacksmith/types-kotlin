// Automatically generated - do not modify!

package web.cssom

import web.cssom.CSSStyleSheet
import web.dom.Element
import web.dom.Node

/**
 * A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet)
 */
sealed external class StyleSheet {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled)
 */
var disabled: Boolean
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href)
 */
val href: String?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media)
 */
val media: MediaList
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode)
 */
val ownerNode: Any /* Element | ProcessingInstruction */?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet)
 */
val parentStyleSheet: CSSStyleSheet?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title)
 */
val title: String?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type)
 */
val type: String
}
