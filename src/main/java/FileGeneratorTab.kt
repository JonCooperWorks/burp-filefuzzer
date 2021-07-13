package burp

import java.awt.Component
import javax.swing.JPanel
import javax.swing.JTextField

/**
 * FileGeneratorTab is a Burp Suite tab that allows a user of the extension to specify a desired filename for payloads
 * and file size.
 * It implements the <code>ITabFormData</code> interface.
 * @see burp.ITabFormData
 */
class FileGeneratorTab: JPanel(), ITab, ITabFormData {

    companion object {
        const val tabName = "File Generator"
    }

    private val payloadNameField = JTextField()
    private val payloadFileSizeField = JTextField()


    init {
        add(payloadNameField)
        add(payloadFileSizeField)
    }

    override fun getTabCaption(): String {
        return tabName
    }

    override fun getUiComponent(): Component {
        return this
    }

    override fun getPayloadFilename(): String {
        return if (payloadNameField.text != "") payloadNameField.text else "payload"
    }

    override fun getPayloadFileSize(): Int {
        return payloadFileSizeField.text.toIntOrNull() ?: 1024
    }
}