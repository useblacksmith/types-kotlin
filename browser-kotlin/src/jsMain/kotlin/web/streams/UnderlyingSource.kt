// Automatically generated - do not modify!

package web.streams

import js.core.JsLong
import js.objects.JsPlainObject
import web.streams.ReadableStream

@JsPlainObject
sealed external interface UnderlyingSource<R> {
var autoAllocateChunkSize: JsLong?
var cancel: UnderlyingSourceCancelCallback?
var pull: UnderlyingSourcePullCallback<R>?
var start: UnderlyingSourceStartCallback<R>?
var type: ReadableStreamType?
}
