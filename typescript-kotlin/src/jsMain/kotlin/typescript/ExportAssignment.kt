// Automatically generated - do not modify!

package typescript

/**
 * This is either an `export =` or an `export default` declaration.
 * Unless `isExportEquals` is set, this node was parsed as an `export default`.
 */
external sealed interface ExportAssignment : DeclarationStatement, JSDocContainer, Union.ExportAssignment_ {
override val kind: SyntaxKind.ExportAssignment
override val parent: SourceFile
val modifiers: NodeArray<ModifierLike>?
val isExportEquals: Boolean?
val expression: Expression
}
