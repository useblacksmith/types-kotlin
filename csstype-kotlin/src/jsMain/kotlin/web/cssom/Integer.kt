// Automatically generated - do not modify!

@file:Suppress(
"NOTHING_TO_INLINE",
)

package web.cssom

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

        sealed external interface IntegerType:
        ColumnCount,
FontWeight,
GridLine,
HyphenateLimitChars,
LineClamp,
MathDepth,
MaxLines,
Order,
Orphans,
Widows,
ZIndex
        
        inline fun integer(
     value: Int,
): IntegerType =
    value.unsafeCast<IntegerType>()
