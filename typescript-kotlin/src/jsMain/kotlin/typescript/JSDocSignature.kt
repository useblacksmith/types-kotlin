// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

sealed external interface JSDocSignature : JSDocType, Declaration, JSDocContainer, LocalsContainer,
    Union.JSDocSignature_ {
    override val kind: SyntaxKind.JSDocSignature
    val typeParameters: ReadonlyArray<JSDocTemplateTag>?
    val parameters: ReadonlyArray<JSDocParameterTag>
    val type: JSDocReturnTag?
}
