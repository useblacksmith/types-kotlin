// Automatically generated - do not modify!

package web.rtc

import js.core.Void
import js.promise.Promise
import web.events.Event
import web.events.EventTarget
import web.http.Request
import web.streams.ReadableStream
import web.streams.WritableStream

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer)
 */
sealed external class RTCRtpScriptTransformer :
EventTarget {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/options)
 */
val options: Any?
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/readable)
 */
val readable: ReadableStream<*>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/writable)
 */
val writable: WritableStream<*>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/generateKeyFrame)
 */
 fun generateKeyFrame(rid: String = definedExternally): Promise<Number>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCRtpScriptTransformer/sendKeyFrameRequest)
 */
 fun sendKeyFrameRequest(): Promise<Void>
}
