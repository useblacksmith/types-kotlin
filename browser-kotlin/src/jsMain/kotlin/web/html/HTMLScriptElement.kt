// Automatically generated - do not modify!

package web.html

import web.dom.Element
import web.dom.HTMLOrSVGScriptElement
import web.html.HTMLElement
import web.http.CrossOrigin
import web.http.ReferrerPolicy
import web.url.URL

/**
 * HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement)
 */
open external class HTMLScriptElement 
protected constructor():
HTMLElement,
HTMLOrSVGScriptElement {
var async: Boolean
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin)
 */
var crossOrigin: CrossOrigin?
/**
 * Sets or retrieves the status of the script.
 */
var defer: Boolean
var fetchPriority: String
var integrity: String
var noModule: Boolean
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/referrerPolicy)
 */
var referrerPolicy: ReferrerPolicy
/**
 * Retrieves the URL to an external file that contains the source code or data.
 */
var src: String
/**
 * Retrieves or sets the text of the object as a string.
 */
var text: String
/**
 * Sets or retrieves the MIME type for the associated scripting engine.
 */
var type: String
companion object {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/supports_static)
 */
 fun supports(type: String): Boolean
}
}
