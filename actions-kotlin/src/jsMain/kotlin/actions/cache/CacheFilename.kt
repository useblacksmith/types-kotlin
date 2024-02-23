// Automatically generated - do not modify!

@file:Suppress(
"NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package actions.cache

import js.promise.Promise
import js.promise.await
import js.collections.ReadonlyMap
import js.core.BigInt
import js.core.JsLong
import js.objects.Record
import js.array.ReadonlyArray
import js.core.Void
import js.errors.JsError
import node.buffer.Buffer
import node.http.IncomingHttpHeaders
import node.http.OutgoingHttpHeaders
import web.url.URL

import actions.http.client.HttpClient
import actions.http.client.HttpClientResponse

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

        @JsVirtual
        sealed external interface CacheFilename {
            companion object {
            @JsValue("cache.tgz")
val Gzip: CacheFilename
@JsValue("cache.tzst")
val Zstd: CacheFilename
            }
        }
