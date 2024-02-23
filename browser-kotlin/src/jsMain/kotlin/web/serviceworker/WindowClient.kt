// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import web.dom.Document
import web.dom.DocumentVisibilityState
import web.url.URL
import web.window.Window
import web.workers.Worker

/**
 * This ServiceWorker API interface represents the scope of a service worker client that is a document in a browser context, controlled by an active worker. The service worker client independently selects and uses a service worker for its own loading and sub-resources.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient)
 */
sealed external class WindowClient :
Client {
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focused)
 */
val focused: Boolean
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/visibilityState)
 */
val visibilityState: DocumentVisibilityState
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focus)
 */
 fun focus(): Promise<WindowClient>
/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/navigate)
 */
 fun navigate(url: String): Promise<WindowClient?>
 fun navigate(url: URL): Promise<WindowClient?>
}
