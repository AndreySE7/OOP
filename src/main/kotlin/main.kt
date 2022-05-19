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

    val post = Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
        1, 1, "1", 1, true, 1, null, true,true, true, true, true, true, 1, arrayOfAttachment)
    WallService.add(post)
    val comment = Comment(2,1,1,1,"1",1,1,1,arrayOfAttachment,1,1)
    WallService.createComment(comment)

    print(comment)
    print(post)
}