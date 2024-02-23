// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.push

import web.events.Event
import web.events.EventInit
import web.events.EventType
import web.serviceworker.ExtendableEvent
import web.workers.Worker

/**
 * This Push API interface represents a push message that has been received. This event is sent to the global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent)
 */
    open external class PushEvent (
override val type: EventType<PushEvent>,
init: PushEventInit = definedExternally
) : ExtendableEvent,
PushEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PushEvent/data)
 */
override val data: PushMessageData?
    
        companion object : PushEventTypes
    }
