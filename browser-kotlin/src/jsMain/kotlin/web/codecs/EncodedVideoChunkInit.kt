// Automatically generated - do not modify!

package web.codecs

import js.buffer.AllowSharedBufferSource
import js.buffer.BufferSource
import js.core.JsLong
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface EncodedVideoChunkInit {
var data: AllowSharedBufferSource
var duration: JsLong?
var timestamp: JsLong
var type: EncodedVideoChunkType
}
