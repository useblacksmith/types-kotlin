// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.uievents

import web.events.Event
import web.events.EventInit
import web.events.EventTarget
import web.events.EventType

/**
 * Focus-related events like focus, blur, focusin, or focusout.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 */
    open external class FocusEvent (
override val type: EventType<FocusEvent>,
init: FocusEventInit = definedExternally
) : UIEvent,
FocusEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget)
 */
override val relatedTarget: EventTarget?
    
        companion object : FocusEventTypes
    }
