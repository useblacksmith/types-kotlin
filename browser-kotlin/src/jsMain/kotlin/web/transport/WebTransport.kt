// Automatically generated - do not modify!

package web.transport

import js.core.Void
import js.promise.Promise
import web.streams.ReadableStream
import web.streams.WritableStream
import web.url.URL

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport)
 */
 external class WebTransport(
url: String,
options: WebTransportOptions = definedExternally,
) {
constructor(
url: URL,
options: WebTransportOptions = definedExternally,
)

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/closed)
 */
val closed: Promise<WebTransportCloseInfo>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/datagrams)
 */
val datagrams: WebTransportDatagramDuplexStream
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/incomingBidirectionalStreams)
 */
val incomingBidirectionalStreams: ReadableStream<*>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/incomingUnidirectionalStreams)
 */
val incomingUnidirectionalStreams: ReadableStream<*>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/ready)
 */
val ready: Promise<Void>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/close)
 */
 fun close(closeInfo: WebTransportCloseInfo = definedExternally)
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createBidirectionalStream)
 */
 fun createBidirectionalStream(options: WebTransportSendStreamOptions = definedExternally): Promise<WebTransportBidirectionalStream>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebTransport/createUnidirectionalStream)
 */
 fun createUnidirectionalStream(options: WebTransportSendStreamOptions = definedExternally): Promise<WritableStream<*>>
}
