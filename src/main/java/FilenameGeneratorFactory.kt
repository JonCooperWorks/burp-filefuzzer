package burp

class FilenameGeneratorFactory(private val callbacks: IBurpExtenderCallbacks, private val formData: ITabFormData) :
    IIntruderPayloadGeneratorFactory {
    companion object {
        const val fileGeneratorName = "Filename Generator"
    }

    override fun getGeneratorName(): String {
        return fileGeneratorName
    }

    override fun createNewInstance(attack: IIntruderAttack): IIntruderPayloadGenerator {
        return FilenameGenerator(callbacks, formData)
    }
}