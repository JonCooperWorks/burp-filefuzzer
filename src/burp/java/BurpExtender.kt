package burp

class BurpExtender : IBurpExtender, IIntruderPayloadGeneratorFactory, IIntruderPayloadProcessor {
    companion object {
        const val extensionName = "File Fuzzer"
        const val fileGeneratorName = "File Generator"
        const val fileProcessorName = "File Processor"
    }

    override fun registerExtenderCallbacks(callbacks: IBurpExtenderCallbacks) {
        callbacks.setExtensionName(extensionName)
        callbacks.registerIntruderPayloadGeneratorFactory(this)
        callbacks.registerIntruderPayloadProcessor(this)
    }

    override fun getGeneratorName(): String {
        return fileGeneratorName
    }

    override fun createNewInstance(attack: IIntruderAttack): IIntruderPayloadGenerator {
        // TODO: read in file size from UI
        return FilePayloadGenerator(1024)
    }

    override fun getProcessorName(): String {
        return fileProcessorName
    }

    override fun processPayload(
        currentPayload: ByteArray,
        originalPayload: ByteArray,
        baseValue: ByteArray
    ): ByteArray {
        return currentPayload
    }
}