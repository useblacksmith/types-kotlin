// Automatically generated - do not modify!

package typescript

external sealed interface InterfaceDeclaration : DeclarationStatement, JSDocContainer, Union.InterfaceDeclaration_ {
override val kind: SyntaxKind.InterfaceDeclaration
val modifiers: NodeArray<ModifierLike>?
override val name: Identifier
val typeParameters: NodeArray<TypeParameterDeclaration>?
val heritageClauses: NodeArray<HeritageClause>?
val members: NodeArray<TypeElement>
}
