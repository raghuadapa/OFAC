import ofac.SdnListType
import java.io.File
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement

class SDNLoader {

    fun load(filePath: String): SdnListType {
        val jc = JAXBContext.newInstance(SdnListType::class.java!!)
        val unmarshaller = jc.createUnmarshaller()
        val sdnList = unmarshaller.unmarshal(File(filePath)) as JAXBElement<*>

        return (sdnList.value as SdnListType)
    }
}