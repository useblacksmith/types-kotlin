// Automatically generated - do not modify!

@file:Suppress(
"NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

typealias Margin = AutoLengthProperty

   inline fun Margin(
        vertical: AutoLength,
horizontal: AutoLength,
   ): Margin =
       "$vertical $horizontal".unsafeCast<Margin>()

   inline fun Margin(
        top: AutoLength,
horizontal: AutoLength,
bottom: AutoLength,
   ): Margin =
       "$top $horizontal $bottom".unsafeCast<Margin>()

   inline fun Margin(
        top: AutoLength,
right: AutoLength,
bottom: AutoLength,
left: AutoLength,
   ): Margin =
       "$top $right $bottom $left".unsafeCast<Margin>()
