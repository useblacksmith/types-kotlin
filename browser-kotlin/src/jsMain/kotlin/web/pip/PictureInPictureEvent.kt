// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.pip

import web.events.Event
import web.events.EventInit
import web.events.EventType
import web.pip.PictureInPictureEvent
import web.pip.PictureInPictureWindow
import web.window.Window

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent)
 */
    open external class PictureInPictureEvent (
override val type: EventType<PictureInPictureEvent>,
init: PictureInPictureEventInit
) : Event,
PictureInPictureEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PictureInPictureEvent/pictureInPictureWindow)
 */
override val pictureInPictureWindow: PictureInPictureWindow
    
        companion object : PictureInPictureEventTypes
    }
