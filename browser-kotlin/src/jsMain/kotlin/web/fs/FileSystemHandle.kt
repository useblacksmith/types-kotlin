// Automatically generated - do not modify!

package web.fs

import js.promise.Promise
import web.file.File

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle)
 */
sealed external class FileSystemHandle {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/kind)
 */
open val kind: FileSystemHandleKind
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/name)
 */
val name: String
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileSystemHandle/isSameEntry)
 */
 fun isSameEntry(other: FileSystemHandle): Promise<Boolean>
}
