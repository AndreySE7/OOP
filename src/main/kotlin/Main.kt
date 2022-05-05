package data.service

import data.*
import data.service.service.WallService

fun main() {
    val posts = WallService
    val post1 = posts.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
        1, 1, "1", 1, true, true, true, true,
        true, true, true, 1 ))

    print(post1)

}