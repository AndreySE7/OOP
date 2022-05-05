package data.service.service

import data.*

object WallService {

    private val posts = mutableListOf<Post>()
    private var postId = 0

    fun add(post: Post): Post {
        postId++
        val updatedPost = post.copy(id = postId)
        posts.add(updatedPost)
        return updatedPost
    }

    fun update(post: Post): Boolean {
        for ((index, originalPost) in posts.withIndex()) {
            if (originalPost.id == post.id) {
                posts[index] = post.copy(owner_id = post.owner_id, date = post.date)
                return true
            }
        }
        return false
    }

}