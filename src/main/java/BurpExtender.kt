package burp

import javax.swing.SwingUtilities

class BurpExtender : IBurpExtender {
    companion object {
        const val extensionName = "File Fuzzer"
    }

    override fun registerExtenderCallbacks(callbacks: IBurpExtenderCallbacks) {
        callbacks.setExtensionName(extensionName)

        val fileGeneratorTab = FileGeneratorTab()

        callbacks.registerIntruderPayloadGeneratorFactory(FilePayloadGeneratorFactory(fileGeneratorTab))
        callbacks.registerIntruderPayloadGeneratorFactory(FilenameGeneratorFactory(callbacks, fileGeneratorTab))

        SwingUtilities.invokeLater {
            callbacks.customizeUiComponent(fileGeneratorTab)
            callbacks.addSuiteTab(fileGeneratorTab)
        }
    }

}