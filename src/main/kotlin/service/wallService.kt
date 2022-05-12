package data.service.service

import data.*

object WallService {

    private var posts = emptyArray<Post>()
        private var postId = 1

    fun add(post: Post): Post {
        post.id = postId
        postId++
        posts += post
        return posts.last()
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

    fun historyPost(post: Post): Post {
        var copy_history = post.copy_history ?: post
        return post
    }

}