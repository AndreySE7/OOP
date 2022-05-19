import org.junit.Test

import org.junit.Assert.*

import data.service.service.*
import data.*


class WallServiceTest {

    private val posts = WallService
    private val arrayOfAttachment = emptyArray<Attachment>()
    private var comments = emptyArray<Comment>()

    @Test
    fun addTest() {

        val result = posts.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment))

        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTestTrue() {

        val result = posts.update(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment))

        assertTrue(result)
    }

    @Test
    fun updateTestFalse() {

        val result = posts.update(Post(0, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment))

        assertFalse(result)
    }


    @Test
    fun historyPostTestNoHistory() {

        val result = posts.historyPost(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment))

        assertNotEquals("Нет истории", result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val post = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,true, true, true, true, true, 1, arrayOfAttachment)
        WallService.add(post)
        val comment = Comment(2,1,1,1,"1",1,1,1,arrayOfAttachment,1,1)
        WallService.createComment(comment)

        if (comment.postId != post.id) {
            throw PostNotFoundException()
        }
    }

    @Test
    fun createComment() {
        val post = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,true, true, true, true, true, 1, arrayOfAttachment)
        WallService.add(post)
        val comment = Comment(1,1,1,1,"1",1,1,1,arrayOfAttachment,1,1)
        WallService.createComment(comment)

        if (comment.postId == post.id) {
            comments += comment
        }
    }

}
