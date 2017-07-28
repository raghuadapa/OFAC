import org.junit.Test

import org.junit.Assert.*


class SDNLoaderTest {

    @Test
    fun load_whenValidPath_returnsSDNList() {
        val subject = SDNLoader()

        val sdnList = subject.load(javaClass.getResource("/sdn.xml").path)

        assertEquals(sdnList.sdnEntry.size, 5906)
    }
}