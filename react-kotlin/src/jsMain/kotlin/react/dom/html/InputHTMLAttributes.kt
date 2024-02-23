// Automatically generated - do not modify!

package react.dom.html

import react.dom.aria.AriaAttributes
import react.dom.aria.AriaRole    
import react.dom.DOMAttributes
import web.html.EnterKeyHint
import web.html.InputType
import web.html.Loading
import web.http.ReferrerPolicy
import web.window.WindowTarget
import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue
import web.dom.Element
import web.http.CrossOrigin
import react.dom.events.*

external interface InputHTMLAttributes<T : Element> : HTMLAttributes<T> {
var accept: String?
var alt: String?
var autoComplete: AutoComplete?
var capture: Capture?
var checked: Boolean?
var crossOrigin: CrossOrigin?
var disabled: Boolean?
var enterKeyHint: EnterKeyHint?
var form: String?
var formAction: String? /* FormAction */
var formEncType: String?
var formMethod: String?
var formNoValidate: Boolean?
var formTarget: WindowTarget?
var height: Double?
var list: String?
var max: Any? /* number | Date */
var maxLength: Int?
var min: Any? /* number | Date */
var minLength: Int?
var multiple: Boolean?
var name: String?
var pattern: String?
override var placeholder: String?
var readOnly: Boolean?
var required: Boolean?
var size: Int?
var src: String?
var step: Double?
var type: InputType?
var value: Any? /* string | ReadonlyArray<string> | number */
var width: Double?
var onChange: ChangeEventHandler<T>?
}
