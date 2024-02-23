// Automatically generated - do not modify!

@file:Suppress(
"NOTHING_TO_INLINE",
)

package web.svg

import web.dom.Element
import web.svg.SVGElement
import web.svg.SvgTagName

sealed external interface SvgTagName<T : SVGElement>

inline fun <T : SVGElement> SvgTagName(
    tagName: String,
): SvgTagName<T> =
    tagName.unsafeCast<SvgTagName<T>>()
