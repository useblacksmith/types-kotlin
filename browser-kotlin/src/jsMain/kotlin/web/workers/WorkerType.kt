// Automatically generated - do not modify!

@file:Suppress(
"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.workers

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.workers.Worker
import web.workers.WorkerType

        @JsVirtual
        sealed external interface WorkerType {
            companion object {
                @JsValue("classic")    
val classic: WorkerType
@JsValue("module")    
val module: WorkerType
            }
        }
