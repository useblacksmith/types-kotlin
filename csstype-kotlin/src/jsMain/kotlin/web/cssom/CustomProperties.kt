// Automatically generated - do not modify!

@file:Suppress(
"NATIVE_INDEXER_KEY_SHOULD_BE_STRING_OR_NUMBER",
)

package web.cssom

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

external interface CustomProperties {
    @nativeGetter
    @Suppress("DEPRECATION")
    operator fun <T : Any> get(
        name: CustomPropertyName<T>,
    ): T?

    @nativeSetter
    @Suppress("DEPRECATION")
    operator fun <T : Any> set(
        name: CustomPropertyName<T>,
        value: T?,
    )
}
