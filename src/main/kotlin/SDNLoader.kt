import ofac.SdnListType
import java.io.File
import java.net.URL
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement

class SDNLoader {

    fun load(filePath: String): SdnListType {
        val jc = JAXBContext.newInstance(SdnListType::class.java)
        val unmarshaller = jc.createUnmarshaller()
        val sdnList = unmarshaller.unmarshal(File(filePath)) as JAXBElement<*>

        return (sdnList.value as SdnListType)
    }

    fun download(url: String): SdnListType {
        val jc = JAXBContext.newInstance(SdnListType::class.java)
        val unmarshaller = jc.createUnmarshaller()
        val sdnList = unmarshaller.unmarshal(URL(url)) as JAXBElement<*>

        return (sdnList.value as SdnListType)
    }
}