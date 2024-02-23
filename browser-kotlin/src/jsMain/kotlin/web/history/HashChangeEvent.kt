// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.history

import web.events.Event
import web.events.EventInit
import web.events.EventType
import web.url.URL

/**
 * Events that fire when the fragment identifier of the URL has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent)
 */
    open external class HashChangeEvent (
override val type: EventType<HashChangeEvent>,
init: HashChangeEventInit = definedExternally
) : Event,
HashChangeEventInit {
        /**
 * Returns the URL of the session history entry that is now current.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/newURL)
 */
override val newURL: String
/**
 * Returns the URL of the session history entry that was previously current.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/oldURL)
 */
override val oldURL: String
    
        companion object : HashChangeEventTypes
    }
