package burp

class FilePayloadGeneratorFactory(private val fileSize: Int): IIntruderPayloadGeneratorFactory {
    companion object {
        const val fileGeneratorName = "File Generator"
    }

    override fun getGeneratorName(): String {
        return fileGeneratorName
    }

    override fun createNewInstance(attack: IIntruderAttack): IIntruderPayloadGenerator {
        return FilePayloadGenerator(fileSize)
    }
}