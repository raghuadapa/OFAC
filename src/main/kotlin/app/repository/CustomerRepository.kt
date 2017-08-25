package app.repository

import app.model.Customer
import org.springframework.stereotype.Repository
import java.util.concurrent.atomic.AtomicLong

@Repository
class CustomerRepository {

    fun getCustomerInfo(firstName: String, lastName: String): List<Customer> {

        val customerList = java.util.ArrayList<Customer>()

        val customer1 = Customer("firstName1", "lastName1", "address1", "date1", AtomicLong(111111111))
        val customer2 = Customer("firstName2", "lastName2", "address2", "date2", AtomicLong(222222222))

        customerList.add(customer1)
        customerList.add(customer2)

        return customerList
    }

}