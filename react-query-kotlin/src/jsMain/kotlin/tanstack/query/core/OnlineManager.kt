// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

open external class OnlineManager (): Subscribable<Listener> {
override protected fun  onSubscribe()
override protected fun  onUnsubscribe()
open fun  setEventListener(setup: OnlineManagerSetupFn )
open fun  setOnline(online: Boolean )
open fun  isOnline(): Boolean
}