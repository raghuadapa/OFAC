package app.controller

import app.SDNLoader
import app.model.SDNEntry
import app.repository.PostRepository
import com.fasterxml.jackson.databind.ObjectMapper
import com.mongodb.util.JSON
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class SearchController(@Autowired val repository: PostRepository,
                       @Autowired val mongoTemplate: MongoTemplate) {

    @GetMapping("/health")
    fun health() = "ok"

    @GetMapping("/search/lastName")
    fun customer(@RequestParam(value = "lastName") lastName: String) : SDNEntry? =
            repository.findByLastName(lastName)   //FIXME: crashes on no results!

    @GetMapping("/search/firstName")
    fun getSDNByFirstName(@RequestParam(value = "firstName") firstName: String) : SDNEntry? =
            repository.findByFirstName(firstName)

    @GetMapping("/search/firstNameAndLastName")
    fun getSDNByFirstNameAndLastName(@RequestParam(value = "firstName") firstName: String,
                                     @RequestParam(value = "lastName") lastName: String) : SDNEntry? =
            repository.findByFirstNameAndLastName(firstName, lastName)   //FIXME: crashes on no results!

    //TODO: remove load endpoint
    //TODO: move loading part into start of the application
    @GetMapping("/load")
    fun load() {
        var sdn = SDNLoader().download("https://www.treasury.gov/ofac/downloads/sdn.xml")
        var ObjectMapper = ObjectMapper()
        for(item in sdn.sdnEntry) {
            var dbObject = JSON.parse(ObjectMapper.writeValueAsString(item ))
            mongoTemplate.save(dbObject, "SDN")
        }
    }
}

