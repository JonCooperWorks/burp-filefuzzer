package burp

import java.net.URLConnection

class FileMimeTypeGenerator(private val callbacks: IBurpExtenderCallbacks, private val formData: ITabFormData): IIntruderPayloadGenerator {

    private var index = 0

    override fun hasMorePayloads(): Boolean {
        return index < FileTypes.fileHeaders.count()
    }

    override fun getNextPayload(baseValue: ByteArray): ByteArray {
        val payload = FileTypes.fileHeaders.elementAt(index)
        index++
        val filename = formData.getPayloadFilename() + "." + payload.first
        val mimeType = URLConnection.guessContentTypeFromName(filename) ?: "application/octet-stream"
        return callbacks.helpers.stringToBytes(mimeType)
    }

    override fun reset() {
        index = 0
    }
}