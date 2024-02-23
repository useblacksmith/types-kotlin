// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

/**
 * Represents a set of signature help items, and the preferred item that should be selected.
 */
external sealed interface SignatureHelpItems {
var items: ReadonlyArray<SignatureHelpItem>
var applicableSpan: TextSpan
var selectedItemIndex: Int
var argumentIndex: Int
var argumentCount: Int
}
