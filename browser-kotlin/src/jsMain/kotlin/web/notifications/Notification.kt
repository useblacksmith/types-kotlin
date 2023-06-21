// Automatically generated - do not modify!

package web.notifications

import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import kotlin.js.Promise

external class Notification(
    title: String,
    options: NotificationOptions = definedExternally,
) : EventTarget {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/body) */
    val body: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/data) */
    val data: Any?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir) */
    val dir: NotificationDirection

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/icon) */
    val icon: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/lang) */
    val lang: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/click_event) */
    var onclick: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close_event) */
    var onclose: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/error_event) */
    var onerror: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/show_event) */
    var onshow: EventHandler<Event>?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/silent) */
    val silent: Boolean?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/tag) */
    val tag: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/title) */
    val title: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close) */
    fun close()

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/permission_static) */
        val permission: NotificationPermission

        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requestPermission_static) */
        fun requestPermission(deprecatedCallback: NotificationPermissionCallback = definedExternally): Promise<NotificationPermission>
    }
}
