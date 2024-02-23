// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.transferable.Transferable
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget
import web.messaging.MessageEvent
import web.messaging.MessageEventSource
import web.serialization.StructuredSerializeOptions
import web.url.URL
import web.workers.AbstractWorker
import web.workers.Worker

/**
 * This ServiceWorker API interface provides a reference to a service worker. Multiple browsing contexts (e.g. pages, workers, etc.) can be associated with the same service worker, each through a unique ServiceWorker object.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker)
 */
sealed external class ServiceWorker :
EventTarget,
AbstractWorker,
MessageEventSource {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
 */
var onstatechange: EventHandler<Event>?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/scriptURL)
 */
val scriptURL: String
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state)
 */
val state: ServiceWorkerState
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/postMessage)
 */
 fun postMessage(
message: Any?,
transfer: ReadonlyArray<Transferable>,
)
 fun postMessage(
message: Any?,
options: StructuredSerializeOptions = definedExternally,
)
}
