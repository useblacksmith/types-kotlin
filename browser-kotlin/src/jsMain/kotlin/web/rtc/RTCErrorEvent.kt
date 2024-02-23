// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.rtc

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent)
 */
    open external class RTCErrorEvent (
override val type: EventType<RTCErrorEvent>,
init: RTCErrorEventInit
) : Event,
RTCErrorEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCErrorEvent/error)
 */
override val error: RTCError
    
        companion object : RTCErrorEventTypes
    }
