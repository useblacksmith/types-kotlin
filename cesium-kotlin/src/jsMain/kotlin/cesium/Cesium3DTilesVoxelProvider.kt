// Automatically generated - do not modify!

@file:JsModule("cesium")

package cesium

import js.promise.Promise
import web.canvas.ImageData
import web.dom.Document
import web.dom.Element
import web.html.HTMLCanvasElement
import web.html.HTMLElement
import web.html.HTMLIFrameElement
import web.html.HTMLImageElement
import web.html.HTMLVideoElement
import web.xml.XMLDocument
import js.buffer.ArrayBuffer
import js.objects.jso
import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import js.core.Void
import js.errors.JsError
import js.typedarrays.Float32Array
import js.typedarrays.Float64Array
import js.typedarrays.Uint16Array
import js.typedarrays.Uint8Array
import web.blob.Blob

/**
 * A [VoxelProvider] that fetches voxel data from a 3D Tiles tileset.
 * 
 * Implements the [VoxelProvider] interface.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html">Online Documentation</a>
 */
external  class Cesium3DTilesVoxelProvider ( options: Any)  {
/**
 * A transform from local space to global space. If undefined, the identity matrix will be used instead.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#globalTransform">Online Documentation</a>
 */
val globalTransform: Matrix4?

/**
 * A transform from shape space to local space. If undefined, the identity matrix will be used instead.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#shapeTransform">Online Documentation</a>
 */
val shapeTransform: Matrix4?

/**
 * Gets the [VoxelShapeType]
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#shape">Online Documentation</a>
 */
val shape: VoxelShapeType

/**
 * Gets the minimum bounds.
 * If undefined, the shape's default minimum bounds will be used instead.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#minBounds">Online Documentation</a>
 */
val minBounds: Cartesian3?

/**
 * Gets the maximum bounds.
 * If undefined, the shape's default maximum bounds will be used instead.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#maxBounds">Online Documentation</a>
 */
val maxBounds: Cartesian3?

/**
 * Gets the number of voxels per dimension of a tile. This is the same for all tiles in the dataset.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#dimensions">Online Documentation</a>
 */
val dimensions: Cartesian3

/**
 * Gets the number of padding voxels before the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#paddingBefore">Online Documentation</a>
 */
val paddingBefore: Cartesian3?

/**
 * Gets the number of padding voxels after the tile. This improves rendering quality when sampling the edge of a tile, but it increases memory usage.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#paddingAfter">Online Documentation</a>
 */
val paddingAfter: Cartesian3?

/**
 * Gets the metadata names.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#names">Online Documentation</a>
 */
val names: ReadonlyArray<String>

/**
 * Gets the metadata types.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#types">Online Documentation</a>
 */
val types: ReadonlyArray<MetadataType>

/**
 * Gets the metadata component types.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#componentTypes">Online Documentation</a>
 */
val componentTypes: ReadonlyArray<MetadataComponentType>

/**
 * Gets the metadata minimum values.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#minimumValues">Online Documentation</a>
 */
val minimumValues: ReadonlyArray<ReadonlyArray<Double>>?

/**
 * Gets the metadata maximum values.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#maximumValues">Online Documentation</a>
 */
val maximumValues: ReadonlyArray<ReadonlyArray<Double>>?

/**
 * The maximum number of tiles that exist for this provider. This value is used as a hint to the voxel renderer to allocate an appropriate amount of GPU memory. If this value is not known it can be undefined.
 * This should not be called before [VoxelProvider.ready] returns true.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#maximumTileCount">Online Documentation</a>
 */
val maximumTileCount: Double?

/**
 * Requests the data for a given tile. The data is a flattened 3D array ordered by X, then Y, then Z.
 * This function should not be called before [VoxelProvider.ready] returns true.
 * @return A promise to an array of typed arrays containing the requested voxel data or undefined if there was a problem loading the data.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#requestData">Online Documentation</a>
 */
 fun requestData ( options: RequestDataOptions? = definedExternally): Promise<ReadonlyArray<ReadonlyArray<Any>>>?

/**
 * @property [tileLevel] The tile's level.
 *   Default value - `0`
 * @property [tileX] The tile's X coordinate.
 *   Default value - `0`
 * @property [tileY] The tile's Y coordinate.
 *   Default value - `0`
 * @property [tileZ] The tile's Z coordinate.
 *   Default value - `0`
 */
 interface RequestDataOptions {
var  tileLevel: Int?
var  tileX: Double?
var  tileY: Double?
var  tileZ: Double?
}

companion object  {
/**
 * Creates a [VoxelProvider] that fetches voxel data from a 3D Tiles tileset.
 * @param [url] The URL to a tileset JSON file
 * @return The created provider
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Cesium3DTilesVoxelProvider.html#.fromUrl">Online Documentation</a>
 */
 fun fromUrl ( url: Resource): Promise<Cesium3DTilesVoxelProvider>

 fun fromUrl ( url: String): Promise<Cesium3DTilesVoxelProvider>
}
}
