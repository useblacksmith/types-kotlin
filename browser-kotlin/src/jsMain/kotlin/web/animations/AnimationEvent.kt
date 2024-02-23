// Automatically generated - do not modify!

@file:Suppress(
"EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.animations

import web.animations.Animation
import web.dom.Element
import web.events.Event
import web.events.EventInit
import web.events.EventType

/**
 * Events providing information related to animations.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent)
 */
    open external class AnimationEvent (
override val type: EventType<AnimationEvent>,
init: AnimationEventInit = definedExternally
) : Event,
AnimationEventInit {
        /**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/animationName)
 */
override val animationName: String
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/elapsedTime)
 */
override val elapsedTime: Double
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AnimationEvent/pseudoElement)
 */
override val pseudoElement: String
    
        companion object : AnimationEventTypes
    }
