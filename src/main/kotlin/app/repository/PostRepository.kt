package app.repository

import app.model.SDNEntry
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository : MongoRepository<SDNEntry, String> {
    fun findByLastName(lastName: String) : SDNEntry?
}