package app.model

import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Document(collection = "PublishInfo")
class PublishInfo (
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val _id: ObjectId? = null,
        val publishDate: Date? = null,
        val recordCount: Integer? = null)