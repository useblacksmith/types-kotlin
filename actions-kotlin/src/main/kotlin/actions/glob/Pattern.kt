// Automatically generated - do not modify!

@file:JsModule("@actions/glob")

package actions.glob

import js.core.ReadonlyArray

external class Pattern {
    /**
     * Indicates whether matches should be excluded from the result set
     */
    val negate: Boolean

    /**
     * The directory to search. The literal path prior to the first glob segment.
     */
    val searchPath: String

    /**
     * The path/pattern segments. Note, only the first segment (the root directory)
     * may contain a directory separator character. Use the trailingSeparator field
     * to determine whether the pattern ended with a trailing slash.
     */
    val segments: ReadonlyArray<String>

    /**
     * Indicates the pattern should only match directories, not regular files.
     */
    val trailingSeparator: Boolean
    /**
     * The Minimatch object used for matching
     */
    // private readonly minimatch
    /**
     * Used to workaround a limitation with Minimatch when determining a partial
     * match and the path is a root directory. For example, when the pattern is
     * `/foo/ **` or `C:\foo\**` and the path is `/` or `C:\`.
     */
    // private readonly rootRegExp
    /**
     * Indicates that the pattern is implicitly added as opposed to user specified.
     */
    // private readonly isImplicitPattern
    // constructor(pattern: string)
    // constructor(pattern: string, isImplicitPattern: boolean, segments: undefined, homedir: string)
    // constructor(negate: boolean, isImplicitPattern: boolean, segments: string[], homedir?: string)
    /**
     * Matches the pattern against the specified path
     */
    fun match(itemPath: String): MatchKind

    /**
     * Indicates whether the pattern may match descendants of the specified path
     */
    fun partialMatch(itemPath: String): Boolean

    /**
     * Escapes glob patterns within a path
     */
    fun /* static */ globEscape(s: String): String
    /**
     * Normalizes slashes and ensures absolute root
     */
    // private static fixupPattern
    /**
     * Attempts to unescape a pattern segment to create a literal path segment.
     * Otherwise returns empty string.
     */
    // private static getLiteral
    /**
     * Escapes regexp special characters
     * https://javascript.info/regexp-escaping
     */
    // private static regExpEscape
}