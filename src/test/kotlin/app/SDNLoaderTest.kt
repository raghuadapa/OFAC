package app
import org.junit.Test
import org.junit.Assert.*

class SDNLoaderTest {

    @Test
    fun load_whenValidPath_returnsSDNList() {
        val subject = SDNLoader()

        val actual = subject.load(javaClass.getResource("/sdn.xml").path)

        assertEquals(5906, actual.sdnEntry.size)
    }

    @Test
    fun load_whenValidURL_returnSDNList() {
        val subject = SDNLoader()

        val actual = subject.download("https://www.treasury.gov/ofac/downloads/sdn.xml")

        assertTrue(actual.sdnEntry.size > 5907)
    }
}