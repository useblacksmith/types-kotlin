// Automatically generated - do not modify!

@file:Suppress(
"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsVirtual
import seskar.js.JsIntValue

        @JsVirtual
        sealed external interface LanguageServiceMode {
            companion object {
            @JsIntValue(0)
val Semantic: LanguageServiceMode
@JsIntValue(1)
val PartialSemantic: LanguageServiceMode
@JsIntValue(2)
val Syntactic: LanguageServiceMode
            }
        }
