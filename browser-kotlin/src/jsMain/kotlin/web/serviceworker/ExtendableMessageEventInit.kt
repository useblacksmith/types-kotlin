// Automatically generated - do not modify!

package web.serviceworker

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.events.Event
import web.events.EventInit
import web.messaging.MessageEvent
import web.messaging.MessagePort
import web.serviceworker.ExtendableEvent
import web.serviceworker.ExtendableEventInit
import web.workers.Worker

@JsPlainObject
external interface ExtendableMessageEventInit :
ExtendableEventInit  {
val data: Any?
val lastEventId: String?
val origin: String?
val ports: ReadonlyArray<MessagePort>?
val source: Any /* Client | ServiceWorker | MessagePort */?
}
