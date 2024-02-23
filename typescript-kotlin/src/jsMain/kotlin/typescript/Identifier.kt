// Automatically generated - do not modify!

package typescript

external sealed interface Identifier : PrimaryExpression, Declaration, JSDocContainer, FlowContainer, Union.Identifier_ {
override val kind: SyntaxKind.Identifier
/**
 * Prefer to use `id.unescapedText`. (Note: This is available only in services, not internally to the TypeScript compiler.)
 * Text of identifier, but if the identifier begins with two underscores, this will begin with three.
 */
val escapedText: __String
val text: String

}
