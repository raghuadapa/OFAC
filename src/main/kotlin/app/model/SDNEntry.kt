package app.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Document(collection = "SDN")
class SDNEntry(
        val firstName: String? = null,
        val lastName: String? = null,
        val title: String? = null,
        val sdnType: String? = null,
        val remarks: String? = null,
        val company: String? = null,
        val address: String? = null,
        val city: String? = null,
        val postalCode: Integer? = null,
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val _id: ObjectId? = null)
