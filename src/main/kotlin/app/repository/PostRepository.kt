package app.repository

import app.model.SDNEntry
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository : MongoRepository<SDNEntry, ObjectId> {
    fun findByLastName(lastName: String) : SDNEntry?
    fun findByFirstName(firstName: String) : SDNEntry?
    fun findByFirstNameAndLastName(firstName: String, lastName: String): SDNEntry?
}