// Automatically generated - do not modify!

package web.fs

sealed external interface WriteParams {
    var data: Any /* BufferSource | Blob | string */?
    var position: Double?
    var size: Int?
    var type: WriteCommandType
}