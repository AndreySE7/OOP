package data.service.service

import data.*

object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()
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

    fun historyPost(post: Post?) {
        println(post?.copy_history ?: "Нет истории")
    }

    fun createComment(comment: Comment) {

        for (post in posts) {
            if (comment.postId == post.id) {
                comments += comment
            } else {
                throw PostNotFoundException()
            }
        }
    }
}