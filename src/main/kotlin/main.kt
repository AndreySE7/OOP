package data.service

import data.*
import data.service.service.WallService

fun main() {

    var arrayOfAttachment = emptyArray<Attachment>()

    arrayOfAttachment += AudioAttachment("audio")
    arrayOfAttachment += DocumentAttachment("document")
    arrayOfAttachment += LinkAttachment("link")
    arrayOfAttachment += NoteAttachment("note")
    arrayOfAttachment += PageAttachment("page")

    val post1 = WallService.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
        1, 1, "1", 1, true, 1, null, true,
        true, true, true, true, true, 1, arrayOfAttachment))

    print(post1)

}