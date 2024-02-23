// Automatically generated - do not modify!

@file:Suppress(
"NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

typealias Padding = LengthProperty

   inline fun Padding(
        vertical: Length,
horizontal: Length,
   ): Padding =
       "$vertical $horizontal".unsafeCast<Padding>()

   inline fun Padding(
        top: Length,
horizontal: Length,
bottom: Length,
   ): Padding =
       "$top $horizontal $bottom".unsafeCast<Padding>()

   inline fun Padding(
        top: Length,
right: Length,
bottom: Length,
left: Length,
   ): Padding =
       "$top $right $bottom $left".unsafeCast<Padding>()
