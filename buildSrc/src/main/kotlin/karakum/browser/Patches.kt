
package karakum.browser

private val SVG_ANIMATED_ENUMERATION_BEFORE = """
interface SVGAnimatedEnumeration {
    readonly animVal: number;
    baseVal: number;
}
""".trimIndent()

private val SVG_ANIMATED_ENUMERATION_AFTER = """
interface SVGAnimatedEnumeration<T> {
    readonly animVal: T;
    baseVal: T;
}
""".trimIndent()

internal fun String.applyPatches(): String {
    return patchVideoFrameCallback()
        .applyTempEventPatches()
        .applyReadyStatePatches()
        .patchQuerySelectors()
        .patchInterface("URLSearchParams") {
            it.replace("name: string", "key: string")
                .replace(
                    "    has(key: string, value?: string): boolean;",
                    "    has(key: string): boolean;" +
                            "\n    has(key: string, value: string): boolean;",
                )
        }
        .patchInterface("MediaKeyStatusMap") {
            it.replace("(keyId: ", "(key: ")
        }
        .patchInterface("StylePropertyMapReadOnly") {
            it.replace("has(property: ", "has(key: ")
        }
        .patchInterface("EventModifierInit") {
            it.replace("    ", "    readonly ")
        }
        // Safari
        .patchInterface("RTCPeerConnectionIceEventInit") {
            it.replace("\n    url?: string | null;", "")
        }
        // FormData
        .replace(
            "\n    append(name: string, value: string | Blob): void;\n" +
                    "    append(name: string, value: string): void;\n",
            "\n    append(name: string, value: string | Blob): void;\n",
        )
        .replace(
            "\n    set(name: string, value: string | Blob): void;\n" +
                    "    set(name: string, value: string): void;\n",
            "\n    set(name: string, value: string | Blob): void;\n",
        )
        .replace("    getReader(options: { mode: \"byob\" }): ReadableStreamBYOBReader;\n", "")
        .replace(
            "    new(underlyingSource: UnderlyingByteSource, strategy?: { highWaterMark?: number }): ReadableStream<Uint8Array>;\n",
            ""
        )
        .replace(
            "// abort(reason?: any): AbortSignal; - To be re-added in the future",
            "abort(reason?: any): AbortSignal;",
        )
        .replace("    reason?: any;", "    reason?: JsError;")
        .replace("readonly reason: any;", "readonly reason: JsError | undefined;")
        .replace("(reason?: any)", "(reason?: JsError)")
        .replace("\n    exportKey(format: KeyFormat, key: CryptoKey): Promise<ArrayBuffer | JsonWebKey>;", "")
        .splitUnion("string | string[]")
        .splitUnion("string | number[]")
        .splitUnion("number[] | Float32Array")
        .splitUnion("string | WorkerOptions")
        .splitUnion("string | ElementCreationOptions")
        .splitUnion("HTMLOptionElement | HTMLOptGroupElement")
        .splitUnion("HTMLElement | number")
        .splitUnion("string[][] | Record<string, string> | string | URLSearchParams")
        .splitTypealias("BinaryData")
        .splitUnion("string | ArrayBuffer | ArrayBufferView")
        .splitUnion("Document | XMLHttpRequestBodyInit")
        .splitTypealias("XMLHttpRequestBodyInit")
        .splitUnion("Blob | BufferSource | FormData | URLSearchParams | string")
        .splitUnion("string | URL")
        .splitUnion("string | Blob")
        .splitUnion("RequestInfo | URL")
        .splitUnion("RequestInfo", "Request | string")
        .replace("headers?: HeadersInit", "headers?: Headers")
        .splitTypealias("HeadersInit")
        .splitUnion("[string, string][] | Record<string, string> | Headers")
        .splitUnion("MediaStreamTrack | string")
        .splitTypealias("ImageBitmapSource")
        .splitUnion("CanvasImageSource | Blob | ImageData")
        .splitUnion("Path2D | string")
        .splitUnion("string | PerformanceMeasureOptions")
        .splitUnion("string | ArrayBufferLike | Blob | ArrayBufferView")
        .splitUnion("AlgorithmIdentifier | AesDerivedKeyParams | HmacImportParams | HkdfParams | Pbkdf2Params")
        .splitUnion("AlgorithmIdentifier | EcdhKeyDeriveParams | HkdfParams | Pbkdf2Params")
        .splitUnion("AlgorithmIdentifier | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | AesKeyAlgorithm")
        .splitUnion("AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesGcmParams")
        .splitUnion("AlgorithmIdentifier | RsaPssParams | EcdsaParams")
        .splitUnion("AlgorithmIdentifier", "Algorithm | string")
        .splitUnion("RsaHashedKeyGenParams | EcKeyGenParams")
        .splitUnion("AesKeyGenParams | HmacKeyGenParams | Pbkdf2Params")
        .splitUnion("IDBValidKey | IDBKeyRange")
        .splitUnion("PaymentDetailsUpdate | PromiseLike<PaymentDetailsUpdate>")
        .splitUnion("Response | PromiseLike<Response>")
        .splitUnion("Keyframe[] | PropertyIndexedKeyframes")
        .splitUnion("number | KeyframeAnimationOptions")
        .splitUnion("number | KeyframeEffectOptions")
        .patchDomGeometry()
        .replace(GET_CONTEXT_REGEX, "")
        .replace("quality?: any", "quality?: number")
        .replace("LockGrantedCallback): Promise<any>", "LockGrantedCallback): Promise<void>")
        .replace("(lock: Lock | null): any", "(lock: Lock | null): void")
        .replace("clearWatch(watchId: number)", "clearWatch(watchId: $GEOLOCATION_WATCH_ID)")
        .replace(": PositionOptions): number;", ": PositionOptions): $GEOLOCATION_WATCH_ID;")
        .replaceFirst("readonly labels: NodeList;", "readonly labels: NodeListOf<HTMLLabelElement>;")
        .replaceFirst(
            """    setFormValue(value: File | string | FormData | null, state?: File | string | FormData | null): void;""",
            sequenceOf(
                """    setFormValue(value: File | null, state?: File | null): void;""",
                """    setFormValue(value: string | null, state?: string | null): void;""",
                """    setFormValue(value: FormData | null, state?: FormData | null): void;""",
            ).joinToString("\n")
        )
        // TODO: use `Error`
        .replace("  error(e?: any)", "  error(error?: JsError)")
        .replace(
            Regex("""forEach\(callbackfn: \(value: ([\w\[\]]+), .+?, thisArg\?: any\): void;"""),
            "forEach(action: (item: $1) => void): void;"
        )
        .replace("): undefined | CSSStyleValue", "): CSSStyleValue | undefined")
        .replace(
            "FileSystemWritableFileStream extends WritableStream {",
            "FileSystemWritableFileStream extends WritableStream<FileSystemWriteChunkType> {"
        )
        .patchCollections()
        .replace(
            "arg?: boolean | ScrollIntoViewOptions",
            "options?: ScrollIntoViewOptions",
        )
        .replace(""": "jwk"""", ": KeyFormat.jwk")
        .replace(""": Exclude<KeyFormat, "jwk">""", ": KeyFormat")
        .replace(
            "getModifierState(keyArg: string): boolean",
            "getModifierState(keyArg: $MODIFIER_KEY_CODE): boolean",
        )
        // TODO: apply for `KeyboardEvent` only
        .replace(
            "readonly code: string",
            "readonly code: KeyCode",
        )
        .replace(
            "code?: string",
            "code?: KeyCode",
        )
        .replace(
            "referrerPolicy: string",
            "referrerPolicy: ReferrerPolicy",
        )
        .replace(
            """decoding: "async" | "sync" | "auto";""",
            """decoding: ImageDecoding;""",
        )
        .replace(
            """loading: "eager" | "lazy";""",
            """loading: Loading;""",
        )
        .replace(
            """enterKeyHint: string;""",
            """enterKeyHint: EnterKeyHint;""",
        )
        .replace(
            """inputMode: string;""",
            """inputMode: InputMode;""",
        )
        .replace(
            "crossOrigin: string",
            "crossOrigin: CrossOrigin",
        )
        .replace(SVG_ANIMATED_ENUMERATION_BEFORE, SVG_ANIMATED_ENUMERATION_AFTER)
        .applyInlineUnionPatches()
}

private val DOM_GEOMETRY_ALIASES = listOf(
    "DOMPointInit" to "DOMPointReadOnly",
    "DOMRectInit" to "DOMRectReadOnly",
    "DOMMatrixInit" to "DOMMatrixReadOnly",
    "DOMMatrix2DInit" to "DOMMatrixReadOnly",
)

private fun String.patchDomGeometry(): String =
    DOM_GEOMETRY_ALIASES.fold(this) { acc, (initType, aliasType) ->
        acc.splitUnionSafety(initType, "$initType | $aliasType /* $initType */")
    }

private fun String.patchVideoFrameCallback(): String =
    replace(
        "cancelVideoFrameCallback(handle: number): void;",
        "cancelVideoFrameCallback(requestId: $VIDEO_FRAME_REQUEST_ID): void;"
    )
        .replace(
            "requestVideoFrameCallback(callback: VideoFrameRequestCallback): number;",
            "requestVideoFrameCallback(callback: VideoFrameRequestCallback): $VIDEO_FRAME_REQUEST_ID;"
        )

private fun String.patchCollections(): String {
    var result = this

    sequenceOf(
        "NodeList" to "Node",
        "HTMLCollectionBase" to "Element",
        "HTMLCollection" to "Element",
    ).forEach { (type, bound) ->
        val body = Regex("""interface $type [\s\S]+?}""")
            .find(this)!!
            .value

        val newBody = body
            .replaceFirst(type, "$type<T extends $bound>")
            .replace(": $bound", ": T")

        result = result.replace(body, newBody)
    }

    return result
}

internal fun String.patchInterface(
    name: String,
    transform: (String) -> String,
): String {
    val oldBody = substringAfter("\ninterface $name ", "")
        .substringAfter("{\n")
        .substringBefore("\n}", "")

    return replaceFirst(oldBody, transform(oldBody))
}

private fun String.patchQuerySelectors(): String =
    this
        .replace(
            "querySelector<K extends keyof HTMLElementTagNameMap>(selectors: K): HTMLElementTagNameMap[K] | null;",
            "querySelector<T extends HTMLElement>(selectors: HtmlTagName<T>): T | null;"
        )
        .replace(
            "querySelector<K extends keyof SVGElementTagNameMap>(selectors: K): SVGElementTagNameMap[K] | null;",
            "querySelector<T extends SVGElement>(selectors: SvgTagName<T>): T | null;"
        )
        .replace(
            "querySelector<K extends keyof MathMLElementTagNameMap>(selectors: K): MathMLElementTagNameMap[K] | null;",
            "querySelector<T extends MathMLElement>(selectors: MathMLTagName<T>): T | null;"
        )
        .replace(
            "querySelector<E extends Element = Element>(selectors: string): E | null;",
            "querySelector(selectors: string): Element | null;"
        )
        .replace(
            "querySelectorAll<K extends keyof HTMLElementTagNameMap>(selectors: K): NodeListOf<HTMLElementTagNameMap[K]>;",
            "querySelectorAll<T extends HTMLElement>(selectors: HtmlTagName<T>): NodeListOf<T>;"
        )
        .replace(
            "querySelectorAll<K extends keyof SVGElementTagNameMap>(selectors: K): NodeListOf<SVGElementTagNameMap[K]>;",
            "querySelectorAll<T extends SVGElement>(selectors: SvgTagName<T>): NodeListOf<T>;"
        )
        .replace(
            "querySelectorAll<K extends keyof MathMLElementTagNameMap>(selectors: K): NodeListOf<MathMLElementTagNameMap[K]>;",
            "querySelectorAll<T extends MathMLElement>(selectors: MathMLTagName<T>): NodeListOf<T>;"
        )
        .replace(
            "querySelectorAll<E extends Element = Element>(selectors: string): NodeListOf<E>;",
            "querySelectorAll(selectors: string): NodeListOf<Element>;"
        )
        .replace(
            "\"$SVG_NAMESPACE\"",
            "SVG_NAMESPACE"
        )
        .replace(
            "\"$MATHML_NAMESPACE\"",
            "MATHML_NAMESPACE"
        )

private fun String.applyInlineUnionPatches(): String =
    UNION_DATA_LIST.fold(this) { acc, data ->
        val before = ": " + data.values.joinToString(" | ") { "\"$it\"" }
        require(before in acc)
        acc.replace(before, ": ${data.name}")
    }

// TODO: remove after `splitUnion` fix
private fun String.splitUnionSafety(
    union: String,
    unionBody: String,
): String {
    val parts = unionBody.split(" | ")

    return splitToSequence("\n")
        .flatMap { line ->
            splitUnionLine(
                line = line,
                union = union,
                parts = parts,
                optional = true,
            )
        }
        .joinToString("\n")
}

internal fun String.splitTypealias(
    name: String,
): String {
    val aliasDeclaration = "\ntype $name = "
    val aliasBody = substringAfter(aliasDeclaration)
        .substringBefore("\n")

    return replace(aliasDeclaration + aliasBody, "")
        .replace(name, aliasBody.removeSuffix(";"))
}

internal fun String.splitUnion(
    union: String,
    unionBody: String? = null,
): String {
    val parts = (unionBody ?: union).split(" | ")

    return splitToSequence("\n")
        .flatMap { line ->
            splitUnionLine(
                line = line,
                union = union,
                parts = parts,
                optional = true,
            )
        }
        .flatMap { line ->
            splitUnionLine(
                line = line,
                union = union,
                parts = parts,
                optional = false,
            )
        }
        .joinToString("\n")
}

private fun splitUnionLine(
    line: String,
    union: String,
    parts: List<String>,
    optional: Boolean,
): Sequence<String> {
    if ("(" !in line || (line.indexOf(":") < line.indexOf("(")))
        return sequenceOf(line)

    val optionality = if (optional) "?" else ""
    val declaration = "$optionality: $union"

    if (declaration !in line)
        return sequenceOf(line)

    return parts.asSequence()
        .mapIndexed { index, part ->
            line.replace(declaration, if (index == 0) "$optionality: $part" else ": $part")
        }
}
