// Automatically generated - do not modify!

@file:Suppress(
"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsVirtual
import seskar.js.JsIntValue

        @JsVirtual
        sealed external interface FileWatcherEventKind {
            companion object {
            @JsIntValue(0)
val Created: FileWatcherEventKind
@JsIntValue(1)
val Changed: FileWatcherEventKind
@JsIntValue(2)
val Deleted: FileWatcherEventKind
            }
        }
