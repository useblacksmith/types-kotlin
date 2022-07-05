// Automatically generated - do not modify!

package tanstack.table.core

external interface SortingOptions<TData : RowData> {
    var manualSorting: Boolean?
    var onSortingChange: OnChangeFn<SortingState>?
    var enableSorting: Boolean?
    var enableSortingRemoval: Boolean?
    var enableMultiRemove: Boolean?
    var enableMultiSort: Boolean?
    var sortDescFirst: Boolean?
    var getSortedRowModel: ((table: Table<any>) -> () -> RowModel<any>)?
    var maxMultiSortColCount: number?
    var isMultiSortEvent: ((e: unknown) -> boolean)?
}
