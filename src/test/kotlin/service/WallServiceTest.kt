import org.junit.Test

import org.junit.Assert.*

import data.service.service.WallService
import data.*

class WallServiceTest {

    @Test
    fun addTest() {
        val posts = WallService
        val result = posts.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, true, true, true,
            true, true, true, 1 ))



        assertNotEquals(0, result.id)
    }

    @Test
    fun updateTestTrue() {
        val posts = WallService
        posts.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, true, true, true,
            true, true, true, 1 ))
        val update = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, true, true, true,
            true, true, true, 1)
        val result = posts.update(update)
        assertTrue(result)
    }

    @Test
    fun updateTestFalse() {
        val posts = WallService
        posts.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, true, true, true,
            true, true, true, 1 ))
        val update = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
            1, 1, "1", 1, true, true, true, true,
            true, true, true, 1)
        val result = posts.update(update)
        assertFalse(result)
    }

}
