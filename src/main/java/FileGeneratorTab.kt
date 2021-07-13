package burp

import java.awt.Component
import javax.swing.JLabel
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

        const val payloadNameLabelText = "Payload filename (no extension):"
        const val payloadSizeLabelText = "Payload size (in bytes):"

        const val defaultFilename = "payload"
        const val defaultFileSize = "1024"
    }

    private val payloadNameLabel = JLabel(payloadNameLabelText)
    private val payloadNameField = JTextField()
    private val payloadFileSizeLabel = JLabel(payloadSizeLabelText)
    private val payloadFileSizeField = JTextField()

    init {
        payloadNameField.text = defaultFilename
        payloadFileSizeField.text = defaultFileSize
        add(payloadNameLabel)
        add(payloadNameField)
        add(payloadFileSizeLabel)
        add(payloadFileSizeField)
    }

    override fun getTabCaption(): String {
        return tabName
    }

    override fun getUiComponent(): Component {
        return this
    }

    override fun getPayloadFilename(): String {
        return if (payloadNameField.text != "") payloadNameField.text else defaultFilename
    }

    override fun getPayloadFileSize(): Int {
        return payloadFileSizeField.text.toIntOrNull() ?: defaultFileSize.toInt()
    }
}