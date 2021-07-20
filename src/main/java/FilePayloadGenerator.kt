package burp

import kotlin.random.Random

/**
 * FilePayloadGenerator creates files by appending random bytes to common file headers.
 * It is meant to generate files of different types to test file upload endpoints.
 *
 * @param fileSize The generated files' size in bytes.
 */
class FilePayloadGenerator(private val formData: ITabFormData) : IIntruderPayloadGenerator {

    private var index = 0

    override fun hasMorePayloads(): Boolean {
        return index < FileTypes.fileHeaders.count()
    }

    /**
     * getNextPayload appends a random bytes to a file header from a list of file headers.
     * It is meant to generate files of different types to test file upload endpoints.
     *
     * @param baseValue The base value of the payload position.
     * It will be replaced with a synthetic file of the relevant type.
     */
    override fun getNextPayload(baseValue: ByteArray): ByteArray {
        val payload = FileTypes.fileHeaders.elementAt(index)
        index++
        val header = payload.second
        val fileSize = if (formData.getPayloadFileSize() > header.size) {
            formData.getPayloadFileSize() - header.size
        } else {
            1
        }
        val randomBytes = Random.nextBytes(fileSize)
        return header + randomBytes
    }

    override fun reset() {
        index = 0
    }
}