// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

external sealed interface Signature {
var declaration: Union.Signature_declaration?
var typeParameters: ReadonlyArray<TypeParameter>?
var parameters: ReadonlyArray<Symbol>
var thisParameter: Symbol?
fun  getDeclaration(): SignatureDeclaration
fun  getTypeParameters(): ReadonlyArray<TypeParameter>?
fun  getParameters(): ReadonlyArray<Symbol>
fun  getTypeParameterAtPosition(pos: Int): Type
fun  getReturnType(): Type
fun  getDocumentationComment(typeChecker: TypeChecker?): ReadonlyArray<SymbolDisplayPart>
fun  getJsDocTags(): ReadonlyArray<JSDocTagInfo>
}
