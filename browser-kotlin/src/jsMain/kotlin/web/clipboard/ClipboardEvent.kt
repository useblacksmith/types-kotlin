// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.clipboard

import web.data.DataTransfer
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * Events providing information related to modification of the clipboard, that is cut, copy, and paste events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent)
 */
    open external class ClipboardEvent (
override val type: EventType<ClipboardEvent>,
init: ClipboardEventInit = definedExternally
) : Event,
ClipboardEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/clipboardData)
 */
override val clipboardData: DataTransfer?
    
        companion object : ClipboardEventTypes
    }
