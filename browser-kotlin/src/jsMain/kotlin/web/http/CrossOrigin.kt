// Automatically generated - do not modify!

@file:Suppress(
"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.http.CrossOrigin

        @JsVirtual
        sealed external interface CrossOrigin {
            companion object {
                @JsValue("anonymous")    
val anonymous: CrossOrigin
@JsValue("use-credentials")    
val useCredentials: CrossOrigin
@JsValue("")    
val none: CrossOrigin
            }
        }
