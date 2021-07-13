package burp

/**
 * ITabFormData allows Intruder payload generators to get form data from the UI components.
 * It has two methods: <code>getPayloadFilename</code> and <code>getPayloadFileSize</code>
 * @see burp.ITabFormData#getPayloadFilename()
 * @see burp.ITabFormData#getPayloadFileSize()
 */
interface ITabFormData {
    /**
     * getPayloadFilename returns the desired payload filename from the File Generator UI Tab.
     */
    fun getPayloadFilename(): String

    /**
     * getPayloadFileSize returns the desired payload file size from the File Generator UI Tab.
     */
    fun getPayloadFileSize(): Int
}