import org.junit.Test

import org.junit.Assert.*

import data.service.service.WallService
import data.*
import data.service.data.*

class WallServiceTest {

    var arrayOfAttachment = emptyArray<Attachment>()

    @Test
    fun addTest() {

        val result = WallService.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment))

        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTestTrue() {

        val update = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment)
        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateTestFalse() {

        val update = Post(0, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment)
        val result = WallService.update(update)
        assertFalse(result)
    }

    @Test
    fun historyPostTestNoHistory() {

        val historyPost = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, 1, null, true,
            true, true, true, true, true, 1, arrayOfAttachment)
        val result = WallService.historyPost(historyPost)
        assertNotEquals("Нет истории", result)
    }

}
