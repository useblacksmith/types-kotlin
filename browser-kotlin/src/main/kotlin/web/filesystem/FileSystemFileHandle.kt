// Automatically generated - do not modify!

package web.filesystem

import web.file.File
import kotlin.js.Promise

sealed external class FileSystemFileHandle :
    FileSystemHandle {
    val kind: String /* "file" */
    fun getFile(): Promise<File>
}
