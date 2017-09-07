package app.controller

import app.model.SDNEntry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus.OK
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class SearchControllerTest {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun healthCheck_whenCalled_returnsOk() {
        val actual = testRestTemplate.getForEntity("/health", String::class.java)

        assertEquals(OK, actual.statusCode)
        assertEquals("ok", actual.body)
    }

    @Test
    fun loadData_whenCalled_returnsOk() {
        val actual = testRestTemplate.getForEntity("/load", String::class.java)
        assertEquals(OK, actual.statusCode)
    }


    @Test
    fun searchByLastName_whenValidLastNameProvided_returnsSDNEntry() {
        val lastName = "AEROCARIBBEAN AIRLINES"

        val actual = testRestTemplate.getForEntity("/search/lastName?lastName={lastName}", SDNEntry::class.java, lastName)

        assertNotNull(actual.body)
    }

    @Test
    fun searchByFirstName_whenValidFirstNameProvided_returnsSDNEntry() {
        val firstName = "TEST"

        val actual = testRestTemplate.getForEntity("/search/firstName?firstName={firstName}", SDNEntry::class.java, firstName)

        assertNotNull(actual.body)
    }

    @Test
    fun searchByFirstNameAndLastName_whenFirstNameAndLastName_returnsSDNEntry() {
        val lastName = "AEROCARIBBEAN AIRLINES"
        val firstName = "TEST"
        val actual = testRestTemplate.getForEntity("/search/firstNameAndLastName?firstName={firstName}&lastName={lastName}", SDNEntry::class.java, firstName, lastName)

        assertNotNull(actual.body)
    }
}
