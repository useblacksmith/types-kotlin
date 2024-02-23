// Automatically generated - do not modify!

package tanstack.table.core

import tanstack.table.core.VisibilityColumn as ColumnVisibilityColumn

external interface CellContext<TData : RowData, TValue>{
var cell: Cell<TData, TValue>
var column: Column<TData, TValue>
var getValue: Getter<TValue>
var renderValue: Getter<TValue?>
var row: Row<TData>
var table: Table<TData>
}
