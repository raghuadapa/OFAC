import ofac.SdnListType
import java.io.File
import java.net.URL
import javax.xml.bind.JAXBContext
import javax.xml.bind.JAXBElement
import javax.xml.bind.Unmarshaller

class SDNLoader {

    fun load(filePath: String): SdnListType {
        return sdnListType(unmarshaller().unmarshal(File(filePath)) as JAXBElement<*>)
    }

    fun download(url: String): SdnListType {
        return sdnListType(unmarshaller().unmarshal(URL(url)) as JAXBElement<*>)
    }

    private fun sdnListType(sdnList: JAXBElement<*>) = (sdnList.value as SdnListType)

    private fun unmarshaller(): Unmarshaller {
        val jc = JAXBContext.newInstance(SdnListType::class.java)
        val unmarshaller = jc.createUnmarshaller()

        return unmarshaller
    }
}