// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void

external interface QueryObserverLoadingErrorResult <TData, TError> 
: QueryObserverResult<TData, TError> {
override val data: Void
override val error: TError
override val isError: True
override val isPending: False
override val isLoading: False
override val isLoadingError: True
override val isRefetchError: False
override val isSuccess: False
override val status: QueryStatus /* 'error' */
}