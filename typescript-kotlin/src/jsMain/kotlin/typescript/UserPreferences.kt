// Automatically generated - do not modify!

package typescript

import js.array.ReadonlyArray

external sealed interface UserPreferences {
val disableSuggestions: Boolean?
val quotePreference: QuotePreference?
val includeCompletionsForModuleExports: Boolean?
val includeCompletionsForImportStatements: Boolean?
val includeCompletionsWithSnippetText: Boolean?
val includeAutomaticOptionalChainCompletions: Boolean?
val includeCompletionsWithInsertText: Boolean?
val includeCompletionsWithClassMemberSnippets: Boolean?
val includeCompletionsWithObjectLiteralMethodSnippets: Boolean?
val useLabelDetailsInCompletionEntries: Boolean?
val allowIncompleteCompletions: Boolean?
val importModuleSpecifierPreference: ImportModuleSpecifierPreference?
/** Determines whether we import `foo/index.ts` as "foo", "foo/index", or "foo/index.js" */
val importModuleSpecifierEnding: ImportModuleSpecifierEnding?
val allowTextChangesInNewFiles: Boolean?
val providePrefixAndSuffixTextForRename: Boolean?
val includePackageJsonAutoImports: IncludePackageJsonAutoImports?
val provideRefactorNotApplicableReason: Boolean?
val jsxAttributeCompletionStyle: JsxAttributeCompletionStyle?
val includeInlayParameterNameHints: IncludeInlayParameterNameHints?
val includeInlayParameterNameHintsWhenArgumentMatchesName: Boolean?
val includeInlayFunctionParameterTypeHints: Boolean?
val includeInlayVariableTypeHints: Boolean?
val includeInlayVariableTypeHintsWhenTypeMatchesName: Boolean?
val includeInlayPropertyDeclarationTypeHints: Boolean?
val includeInlayFunctionLikeReturnTypeHints: Boolean?
val includeInlayEnumMemberValueHints: Boolean?
val interactiveInlayHints: Boolean?
val allowRenameOfImportPath: Boolean?
val autoImportFileExcludePatterns: ReadonlyArray<String>?
val preferTypeOnlyAutoImports: Boolean?
val organizeImportsIgnoreCase: dynamic /* "auto" | boolean */
val organizeImportsCollation: dynamic /* "ordinal" | "unicode" */
val organizeImportsLocale: String?
val organizeImportsNumericCollation: Boolean?
val organizeImportsAccentCollation: Boolean?
val organizeImportsCaseFirst: dynamic /* "upper" | "lower" | false */
val organizeImportsTypeOrder: dynamic /* "first" | "last" | "inline" */
val excludeLibrarySymbolsInNavTo: Boolean?
}
