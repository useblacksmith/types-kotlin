// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.speech

import web.errors.ErrorEvent
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent)
 */
    open external class SpeechSynthesisErrorEvent (
override val type: EventType<SpeechSynthesisErrorEvent>,
init: SpeechSynthesisErrorEventInit
) : SpeechSynthesisEvent,
SpeechSynthesisErrorEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechSynthesisErrorEvent/error)
 */
override val error: SpeechSynthesisErrorCode
    
        companion object : SpeechSynthesisErrorEventTypes
    }
