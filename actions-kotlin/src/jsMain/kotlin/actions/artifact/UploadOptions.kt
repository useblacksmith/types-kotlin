// Automatically generated - do not modify!

package actions.artifact

import js.promise.Promise
import js.promise.await
import js.collections.ReadonlyMap
import js.core.BigInt
import js.core.JsLong
import js.objects.Record
import js.array.ReadonlyArray
import js.core.Void
import js.errors.JsError
import node.buffer.Buffer
import node.http.IncomingHttpHeaders
import node.http.OutgoingHttpHeaders
import web.url.URL

import actions.http.client.HttpClient
import actions.http.client.HttpClientResponse

import seskar.js.JsIntValue
import seskar.js.JsVirtual
import seskar.js.JsValue

sealed external interface UploadOptions {
    /**
     * Indicates if the artifact upload should continue if file or chunk fails to upload from any error.
     * If there is a error during upload, a partial artifact will always be associated and available for
     * download at the end. The size reported will be the amount of storage that the user or org will be
     * charged for the partial artifact. Defaults to true if not specified
     *
     * If set to false, and an error is encountered, all other uploads will stop and any files or chunks
     * that were queued will not be attempted to be uploaded. The partial artifact available will only
     * include files and chunks up until the failure
     *
     * If set to true and an error is encountered, the failed file will be skipped and ignored and all
     * other queued files will be attempted to be uploaded. The partial artifact at the end will have all
     * files with the exception of the problematic files(s)/chunks(s) that failed to upload
     *
     */
    var continueOnError: Boolean?
    /**
     * Duration after which artifact will expire in days.
     *
     * By default artifact expires after 90 days:
     * https://docs.github.com/en/actions/configuring-and-managing-workflows/persisting-workflow-data-using-artifacts#downloading-and-deleting-artifacts-after-a-workflow-run-is-complete
     *
     * Use this option to override the default expiry.
     *
     * Min value: 1
     * Max value: 90 unless changed by repository setting
     *
     * If this is set to a greater value than the retention settings allowed, the retention on artifacts
     * will be reduced to match the max value allowed on server, and the upload process will continue. An
     * input of 0 assumes default retention setting.
     */
    var retentionDays: Number?
}
