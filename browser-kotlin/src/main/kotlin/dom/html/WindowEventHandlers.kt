// Automatically generated - do not modify!

package dom.html

import web.events.Event

external interface WindowEventHandlers {
    var onafterprint: ((event: Event) -> Unit)?
    var onbeforeprint: ((event: Event) -> Unit)?
    var onbeforeunload: ((event: BeforeUnloadEvent) -> Unit)?
    var ongamepadconnected: ((event: GamepadEvent) -> Unit)?
    var ongamepaddisconnected: ((event: GamepadEvent) -> Unit)?
    var onhashchange: ((event: HashChangeEvent) -> Unit)?
    var onlanguagechange: ((event: Event) -> Unit)?
    var onmessage: ((event: MessageEvent) -> Unit)?
    var onmessageerror: ((event: MessageEvent) -> Unit)?
    var onoffline: ((event: Event) -> Unit)?
    var ononline: ((event: Event) -> Unit)?
    var onpagehide: ((event: PageTransitionEvent) -> Unit)?
    var onpageshow: ((event: PageTransitionEvent) -> Unit)?
    var onpopstate: ((event: PopStateEvent) -> Unit)?
    var onrejectionhandled: ((event: PromiseRejectionEvent) -> Unit)?
    var onstorage: ((event: StorageEvent) -> Unit)?
    var onunhandledrejection: ((event: PromiseRejectionEvent) -> Unit)?
    var onunload: ((event: Event) -> Unit)?
}