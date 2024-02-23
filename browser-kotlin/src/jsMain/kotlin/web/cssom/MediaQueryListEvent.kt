// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.cssom

import web.cssom.MediaQuery
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent)
 */
    open external class MediaQueryListEvent (
override val type: EventType<MediaQueryListEvent>,
init: MediaQueryListEventInit = definedExternally
) : Event,
MediaQueryListEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/matches)
 */
override val matches: Boolean
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/media)
 */
override val media: MediaQuery
    
        companion object : MediaQueryListEventTypes
    }
