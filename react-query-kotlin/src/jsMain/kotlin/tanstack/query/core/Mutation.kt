// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.promise.Promise

open external class Mutation <TData, TError, TVariables, TContext>(config: MutationConfig<TData, TError, TVariables, TContext> )
: Removable {
open var state: MutationState<TData, TError, TVariables, TContext>
open var options: MutationOptions<TData, TError, TVariables, TContext>
open val mutationId: Int
open fun  setOptions(options: MutationOptions<TData, TError, TVariables, TContext>  = definedExternally)
open var meta: MutationMeta?
open fun  addObserver(observer: MutationObserver<*, *, *, *> )
open fun  removeObserver(observer: MutationObserver<*, *, *, *> )
override protected fun  optionalRemove()
open fun  `continue`(): Promise<Any?>
open fun  execute(variables: TVariables ): Promise<TData>
}