// Automatically generated - do not modify!

package web.errors

import js.objects.JsPlainObject
import js.objects.jso
import web.errors.ErrorEvent
import web.events.Event
import web.events.EventInit
import web.events.EventInitMutable

inline fun ErrorEventInit(
    block: ErrorEventInitMutable.() -> Unit,
): ErrorEventInit =
    jso(block)

@JsPlainObject
external interface ErrorEventInitMutable :
ErrorEventInit,
EventInitMutable  {
override var colno: Int?
override var error: Any?
override var filename: String?
override var lineno: Int?
override var message: String?
}
