/**
 * CRC64: cyclic redundancy check, 64-bits
 *
 * In order to validate that artifacts are not being corrupted over the wire, this redundancy check allows us to
 * validate that there was no corruption during transmission. The implementation here is based on Go's hash/crc64 pkg,
 * but without the slicing-by-8 optimization: https://cs.opensource.google/go/go/+/master:src/hash/crc64/crc64.go
 *
 * This implementation uses a pregenerated table based on 0x9A6C9329AC4BC9B5 as the polynomial, the same polynomial that
 * is used for Azure Storage: https://github.com/Azure/azure-storage-net/blob/cbe605f9faa01bfc3003d75fc5a16b2eaccfe102/Lib/Common/Core/Util/Crc64.cs#L27
 */
/// <reference types="node" />
export declare type CRC64DigestEncoding = 'hex' | 'base64' | 'buffer';

declare class CRC64 {
    private _crc;

    constructor();

    update(data: Buffer | string): void;

    digest(encoding?: CRC64DigestEncoding): string | Buffer;

    private toBuffer;

    static flip64Bits(n: bigint): bigint;
}

export default CRC64;
