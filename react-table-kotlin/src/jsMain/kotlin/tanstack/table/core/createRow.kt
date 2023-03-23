// Automatically generated - do not modify!

@file:JsModule("@tanstack/table-core")

package tanstack.table.core

import js.core.ReadonlyArray

external fun <TData : RowData> createRow(
    table: Table<TData>,
    id: String,
    original: TData,
    rowIndex: Int,
    depth: Int,
    subRows: ReadonlyArray<Row<TData>>? = definedExternally,
    parentRow: Row<TData>? = definedExternally,
): Row<TData>
