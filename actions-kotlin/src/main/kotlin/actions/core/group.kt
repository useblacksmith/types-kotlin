package actions.core

import kotlin.js.Promise

external fun <T> group(
    name: String,
    fn: () -> Promise<T>,
): Promise<T>
