// Automatically generated - do not modify!

package typescript

external sealed interface Watch<T> {
/** Synchronize with host and get updated program */
fun  getProgram(): T
/** Closes the watch */
fun  close()
}
