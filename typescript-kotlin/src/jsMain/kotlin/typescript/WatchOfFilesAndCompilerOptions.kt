// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

/**
 * Creates the watch that generates program using the root files and compiler options
 */
external sealed interface WatchOfFilesAndCompilerOptions<T> : Watch<T> {
/** Updates the root files in the program, only if this is not config file compilation */
fun  updateRootFileNames(fileNames: ReadonlyArray<String>)
}
