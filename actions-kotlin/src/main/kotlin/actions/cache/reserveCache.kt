// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.core.ReadonlyArray
import kotlin.js.Promise

external fun reserveCache(
    key: String,
    paths: ReadonlyArray<String>,
    options: InternalCacheOptions = definedExternally,
): Promise<ITypedResponseWithError<ReserveCacheResponse>>
