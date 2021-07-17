package burp

class FileMimeTypeGeneratorFactory(
    private val callbacks: IBurpExtenderCallbacks,
    private val formData: ITabFormData
) : IIntruderPayloadGeneratorFactory {
    companion object {
        const val name = "File Mime Type Generator"
    }

    override fun getGeneratorName(): String {
        return name
    }

    override fun createNewInstance(attack: IIntruderAttack?): IIntruderPayloadGenerator {
       return FileMimeTypeGenerator(callbacks, formData)
    }
}