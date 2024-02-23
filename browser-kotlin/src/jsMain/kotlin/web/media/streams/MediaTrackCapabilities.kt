// Automatically generated - do not modify!

package web.media.streams

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.media.streams.MediaTrackCapabilities
import web.ranges.Range

@JsPlainObject
sealed external interface MediaTrackCapabilities {
var aspectRatio: DoubleRange?
var autoGainControl: ReadonlyArray<Boolean>?
var channelCount: ULongRange?
var deviceId: String?
var displaySurface: String?
var echoCancellation: ReadonlyArray<Boolean>?
var facingMode: ReadonlyArray<String>?
var frameRate: DoubleRange?
var groupId: String?
var height: ULongRange?
var noiseSuppression: ReadonlyArray<Boolean>?
var sampleRate: ULongRange?
var sampleSize: ULongRange?
var width: ULongRange?
}
