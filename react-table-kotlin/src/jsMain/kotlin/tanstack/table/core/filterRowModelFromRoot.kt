// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.array.ReadonlyArray
import tanstack.table.core.VisibilityColumn as ColumnVisibilityColumn

external fun <TData : RowData> filterRowModelFromRoot(rowsToFilter: ReadonlyArray<Row<TData>>, filterRow: (row: Row<TData>) -> Boolean /* Any? */, table: Table<TData>): RowModel<TData>;
