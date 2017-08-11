package nosql.mongodb

import org.springframework.data.mongodb.repository.MongoRepository

interface PostRepository : MongoRepository<OfacTable, String> {
    //Post? means that return value can be null
    fun findById(id: String) : OfacTable?
}