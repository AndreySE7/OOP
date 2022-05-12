package data.service

import data.*
import data.service.service.WallService

fun main() {

    val post1 = WallService.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
        1, 1, "1", 1, true, 1, null, true,
        true, true, true, true, true, 1 ))

    print(post1.id)

}