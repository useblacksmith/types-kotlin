// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.html

import js.buffer.ArrayBuffer
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent)
 */
    open external class MediaEncryptedEvent (
override val type: EventType<MediaEncryptedEvent>,
init: MediaEncryptedEventInit = definedExternally
) : Event,
MediaEncryptedEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initData)
 */
override val initData: ArrayBuffer?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initDataType)
 */
override val initDataType: String
    
        companion object : MediaEncryptedEventTypes
    }
