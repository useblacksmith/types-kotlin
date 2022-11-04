// Automatically generated - do not modify!

package dom.html

import dom.Element
import dom.css.ElementCSSInlineStyle

abstract external class HTMLElement :
    Element,
    ElementCSSInlineStyle,
    ElementContentEditable {
    var accessKey: String
    val accessKeyLabel: String
    var autocapitalize: String
    var dir: String
    var draggable: Boolean
    var hidden: Boolean
    var inert: Boolean
    var innerText: String
    var lang: String
    val offsetHeight: Int
    val offsetLeft: Int
    val offsetParent: Element?
    val offsetTop: Int
    val offsetWidth: Int
    var outerText: String
    var spellcheck: Boolean
    var title: String
    var translate: Boolean
    fun attachInternals(): ElementInternals
    fun click()
}
