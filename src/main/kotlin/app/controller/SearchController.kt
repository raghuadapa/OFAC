package app.controller

import app.model.Customer
import app.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class SearchController(@Autowired val repository: CustomerRepository) {

    @GetMapping("/search")
    fun customer(@RequestParam(value = "firstName") firstName: String,
                 @RequestParam(value = "lastName") lastName: String) : List<Customer> =
            repository.getCustomerInfo(firstName, lastName);
}

