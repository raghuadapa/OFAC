package app.model

import org.springframework.data.jpa.domain.AbstractPersistable_
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Document(collection = "posts")
class OfacTable(
        val firstName: String,
        val lastName: String,
        val title: String,
        val sdnType: String,
        val remarks: String,
        val company: String,
        val address: String,
        val city: String,
        val postalCode: Integer,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {
    override fun toString(): String {
        return "OfacTable(id=${AbstractPersistable_.id}, firstName='$firstName', lastName='$lastName', title='$title'" +
                "sdnType='$sdnType', remarks='$remarks'" +
                "company='$company', address='$address'," +
                "city='$city', postalCode='$postalCode' )"
    }
}