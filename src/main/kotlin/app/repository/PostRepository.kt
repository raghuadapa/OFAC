package app.repository

import app.model.OfacTable
import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository : MongoRepository<OfacTable, String> {
    fun findById(id: String) : OfacTable?
}