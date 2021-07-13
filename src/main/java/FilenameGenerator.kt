package burp

class FilenameGenerator(private val callbacks: IBurpExtenderCallbacks, private val formData: ITabFormData): IIntruderPayloadGenerator {
    private var index = 0

    override fun hasMorePayloads(): Boolean {
        return index < FileTypes.fileHeaders.size
    }

    /**
     * getNextPayload generates filenames for different file types.
     * It is meant to generate files of different types to test file upload endpoints.
     *
     * @param baseValue The base value of the payload position.
     * It will be replaced with a filename relevant type.
     */
    override fun getNextPayload(baseValue: ByteArray): ByteArray {
        val payload = FileTypes.fileHeaders.asSequence().elementAt(index)
        index++
        val fileType = payload.key
        return callbacks.helpers.stringToBytes(formData.getPayloadFilename() + "." + fileType)
    }

    override fun reset() {
        index = 0
    }
}