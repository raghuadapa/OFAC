package app.controller

import app.model.SDNEntry
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod.GET
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


    //FIXME: Data should be loaded once before tests.
    // -- perhaps Chandra's feature (scheduler) will address it
    // -- or test setup must be done before tests run
    @Test
    fun loadData_whenCalled_returnsOk() {
        val actual = restTemplate.getForEntity("/load", String::class.java)

        assertEquals(OK, actual.statusCode)
    }

    @Test
    fun searchByLastName_whenValidLastNameProvided_returnsSDNEntryRegardlessOfCase() {
        val expectedLastName = "AeRoCARiBBEAN AiRLiNeS"

        val actual = restTemplate.exchange("/search/lastName?lastName={lastName}",
                GET, null, object : ParameterizedTypeReference<List<SDNEntry>>() {

        }, expectedLastName)

        val actualSdns = actual.getBody()

        assertNotNull(actual.body)
        val actualLastName = actualSdns.get(0).lastName
        assertTrue(expectedLastName.equals(actualLastName, true))
    }

    @Test
    fun searchByFirstName_whenValidFirstNameProvided_returnsSDNEntryRegardlessOfCase() {
        val expectedFirstName = "eugene barret"

        val actual = restTemplate.exchange("/search/firstName?firstName={firstName}",
                GET, null, object : ParameterizedTypeReference<List<SDNEntry>>() {

        }, expectedFirstName)

        val actualSdns = actual.getBody()
        val actualFirstName = actualSdns.get(0).firstName

        assertEquals(1, actualSdns.size)
        assertTrue(expectedFirstName.equals(actualFirstName, true))

    }


    //FIXME: this test fails on my machine
    @Test
    fun searchByFirstNameAndLastName_whenFirstNameAndLastName_returnsSDNEntryRegardlessOfCase() {
        val expectedLastName = "santacruz londono"
        val expectedFirstName = "joSe"

        val actual = restTemplate.exchange("/search/firstNameAndLastName?firstName={firstName}&lastName={lastName}",
                GET, null, object : ParameterizedTypeReference<List<SDNEntry>>() {
        }, expectedFirstName, expectedLastName)

        val actualSdns = actual.getBody()
        val actualFirstName = actualSdns.get(0).firstName
        val actualLastName = actualSdns.get(0).lastName

        assertEquals(1, actualSdns.size)
        assertTrue(expectedFirstName.equals(actualFirstName, true))
        assertTrue(expectedLastName.equals(actualLastName, true))
    }
}
