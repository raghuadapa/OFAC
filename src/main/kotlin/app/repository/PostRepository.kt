package app.repository

import app.model.SDNEntry
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository : MongoRepository<SDNEntry, ObjectId> {
    fun findByLastNameIgnoreCase(lastName: String) : List<SDNEntry>?
    fun findByFirstNameIgnoreCase(firstName: String) : List<SDNEntry>?
    fun findByFirstNameIgnoreCaseAndLastNameIgnoreCase(firstName: String, lastName: String): List<SDNEntry>?
}