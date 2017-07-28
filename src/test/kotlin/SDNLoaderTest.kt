import org.junit.Test

import org.junit.Assert.*


class SDNLoaderTest {

    @Test
    fun load_whenValidPath_returnsSDNList() {
        var subject: SDNLoader = SDNLoader()

        val sdnList = subject.load(this.javaClass.getResource("/sdn.xml").path)

        assertEquals(sdnList.sdnEntry.size, 5906)
    }
}