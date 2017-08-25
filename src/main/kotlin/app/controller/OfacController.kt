package app.controller

import app.model.OfacTable
import app.repository.PostRepository
import org.apache.commons.logging.LogFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/mongodb/posts")
class OfacController(@Autowired val repository: PostRepository) {

    val logger = LogFactory.getLog(OfacController::class.java)!!

    @GetMapping()
    fun getPosts(): List<OfacTable> = repository.findAll()

    @GetMapping(value = "/{id}")
    fun getPost(@PathVariable id: String, response: HttpServletResponse): OfacTable? =
            repository.findById(id) ?: notFound(response)

    @PostMapping
    fun createPost(@RequestBody post: OfacTable): ResponseEntity<HttpStatus> {
        val newPost = repository.insert(post)
        val uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newPost.id)
                .toUri()

        return ResponseEntity.created(uri).build()
    }

    @DeleteMapping("/{id}")
    fun deletePost(@PathVariable id: String): ResponseEntity<HttpStatus> =

            when (repository.findById(id)) {
                null -> {
                    logger.debug("Post not found for id: $id")
                    ResponseEntity(HttpStatus.NOT_FOUND)
                }
                else -> {
                    repository.delete(id)
                    ResponseEntity(HttpStatus.ACCEPTED)
                }
            }

    private fun <T> notFound(response: HttpServletResponse): T? {
        response.status = 404
        return null
    }
}
