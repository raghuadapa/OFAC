package app.controller

import app.SDNLoader
import app.model.Customer
import app.repository.CustomerRepository
import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.util.JSON
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class SearchController(@Autowired val repository: CustomerRepository,
                       @Autowired val mongoTemplate: MongoTemplate) {

    @GetMapping("/health")
    fun health() = "ok"

    @GetMapping("/search")
    fun customer(@RequestParam(value = "firstName") firstName: String,
                 @RequestParam(value = "lastName") lastName: String) : List<Customer> =
            repository.getCustomerInfo(firstName, lastName);

    //TODO: add search by first and last name

    //TODO: remove load endpoint
    //TODO: move loading part into start of the application
    @GetMapping("/load")
    fun load() {
        var sdn = SDNLoader().download("https://www.treasury.gov/ofac/downloads/sdn.xml")
        var ObjectMapper = ObjectMapper()
        for(item in sdn.sdnEntry) {
            var dbObject = JSON.parse(ObjectMapper.writeValueAsString(item ))
            mongoTemplate.save(dbObject, "sdnEntryCollection")
        }
    }
}

