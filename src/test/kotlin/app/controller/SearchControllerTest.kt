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
    lateinit var restTemplate: TestRestTemplate

    @Test
    fun healthCheck_whenCalled_returnsOk() {
        val actual = restTemplate.getForEntity("/health", String::class.java)

        assertEquals(OK, actual.statusCode)
        assertEquals("ok", actual.body)
    }

    @Test
    fun loadData_whenCalled_returnsOk() {
        val actual = restTemplate.getForEntity("/load", String::class.java)

        assertEquals(OK, actual.statusCode)
    }


    @Test
    fun searchByLastName_whenValidLastNameProvided_returnsSDNEntryRegardlessOfCase() {
        val expectedLastName = "AeRoCARiBBEAN AiRLiNeS"

        val actual = restTemplate.getForEntity("/search/lastName?lastName={lastName}", SDNEntry::class.java, expectedLastName)

        assertEquals(expectedLastName.toUpperCase(), actual.body.lastName)
    }

    @Test
    fun searchByFirstName_whenValidFirstNameProvided_returnsSDNEntryRegardlessOfCase() {
        val firstName = "eugene barret"

        val actual = restTemplate.getForEntity("/search/firstName?firstName={firstName}", SDNEntry::class.java, firstName)

        assertEquals("NGAIKOSSET", actual.body.lastName)
    }

    @Test
    fun searchByFirstNameAndLastName_whenFirstNameAndLastName_returnsSDNEntryRegardlessOfCase() {
        val lastName = "santacruz londono"
        val firstName = "joSe"

        val actual = restTemplate.getForEntity("/search/firstNameAndLastName?firstName={firstName}&lastName={lastName}", SDNEntry::class.java, firstName, lastName)

        assertEquals("Jose", actual.body.firstName)
    }
}
