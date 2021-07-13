package burp

class BurpExtender : IBurpExtender {
    companion object {
        const val extensionName = "File Fuzzer"
    }

    override fun registerExtenderCallbacks(callbacks: IBurpExtenderCallbacks) {
        callbacks.setExtensionName(extensionName)

        // TODO: read in  file size and name from UI
        callbacks.registerIntruderPayloadGeneratorFactory(FilePayloadGeneratorFactory(1024))
        callbacks.registerIntruderPayloadGeneratorFactory(FilenameGeneratorFactory(callbacks, "payload"))
    }

}