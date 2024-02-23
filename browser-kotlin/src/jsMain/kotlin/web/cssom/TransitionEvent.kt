// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import web.dom.Element
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * Events providing information related to transitions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent)
 */
    open external class TransitionEvent (
override val type: EventType<TransitionEvent>,
init: TransitionEventInit = definedExternally
) : Event,
TransitionEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/elapsedTime)
 */
override val elapsedTime: Double
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/propertyName)
 */
override val propertyName: String
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransitionEvent/pseudoElement)
 */
override val pseudoElement: String
    
        companion object : TransitionEventTypes
    }
