// Automatically generated - do not modify!

package typescript

external sealed interface BindingElement : NamedDeclaration, FlowContainer, Union.BindingElement_ {
override val kind: SyntaxKind.BindingElement
override val parent: BindingPattern
val propertyName: PropertyName?
val dotDotDotToken: DotDotDotToken?
override val name: BindingName
val initializer: Expression?
}
