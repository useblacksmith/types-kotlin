// Automatically generated - do not modify!

package typescript

external sealed interface ImportDeclaration : Statement, Union.ImportDeclaration_ {
override val kind: SyntaxKind.ImportDeclaration
override val parent: Union.ImportDeclaration_parent
val modifiers: NodeArray<ModifierLike>?
val importClause: ImportClause?
/** If this is not a StringLiteral it will be a grammar error. */
val moduleSpecifier: Expression
val attributes: ImportAttributes?
}
