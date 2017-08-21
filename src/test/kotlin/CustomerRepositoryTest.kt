package com.routeone.ofac
import org.junit.Assert
import org.junit.Test


class CustomerRepositoryTest{

    @Test
    fun find_whenValidRequest_returnsCustomer(){
        val subject = CustomerRepository()

        val result = subject.getCustomerInfo("chandra", "reddy");

        val actualCustomerInfo1  = result!!.get(0);

        Assert.assertEquals("firstName1", actualCustomerInfo1.firstName)
        Assert.assertEquals("lastName1", actualCustomerInfo1.lastName)
        Assert.assertEquals("date1", actualCustomerInfo1.dateOfBirth)
        Assert.assertEquals("address1", actualCustomerInfo1.address)

        val actualCustomerInfo2  = result!!.get(1);

        Assert.assertEquals("firstName2", actualCustomerInfo2.firstName)
        Assert.assertEquals("lastName2", actualCustomerInfo2.lastName)
        Assert.assertEquals("date2", actualCustomerInfo2.dateOfBirth)
        Assert.assertEquals("address2", actualCustomerInfo2.address)


    }
}




