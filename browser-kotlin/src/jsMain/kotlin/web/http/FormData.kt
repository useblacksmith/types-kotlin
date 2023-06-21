// Automatically generated - do not modify!

package web.http

import js.collections.MapLike
import js.core.JsIterable
import js.core.JsTuple2
import js.core.ReadonlyArray
import web.buffer.Blob
import web.events.EventTarget

external class FormData(
    form: EventTarget /* HTMLFormElement */ = definedExternally,
    submitter: EventTarget /* HTMLElement */? = definedExternally,
) : MapLike<String, FormDataEntryValue> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append) */
    fun append(
        name: String,
        value: String,
    )

    fun append(
        name: String,
        value: Blob,
    )

    fun append(
        name: String,
        blobValue: Blob,
        filename: String = definedExternally,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete) */
    fun delete(name: String)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get) */
    operator fun get(name: String): FormDataEntryValue?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll) */
    fun getAll(name: String): ReadonlyArray<FormDataEntryValue>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has) */
    fun has(name: String): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set) */
    operator fun set(
        name: String,
        value: String,
    )

    operator fun set(
        name: String,
        value: Blob,
    )

    fun set(
        name: String,
        blobValue: Blob,
        filename: String = definedExternally,
    )

    override fun entries(): JsIterable.Iterator<JsTuple2<String, FormDataEntryValue>>
    override fun keys(): JsIterable.Iterator<String>
    override fun values(): JsIterable.Iterator<FormDataEntryValue>
    override fun forEach(action: (value: FormDataEntryValue, key: String) -> Unit)
}
