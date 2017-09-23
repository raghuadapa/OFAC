package app.repository

import app.model.PublishInfo
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface PublishInfoRepository : MongoRepository<PublishInfo, ObjectId> {

}