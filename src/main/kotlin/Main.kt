package data.service

import data.*
import data.service.data.*
import data.service.service.WallService

fun main() {

    val audio = AttachmentAudio("Аудио")
    val document = AttachmentDocument("Документ")
    val link = AttachmentLink("Связь")
    val note = AttachmentNote("Примечание")
    val page = AttachmentPage("Страница")

    var arrayOfAttachment = emptyArray<Attachment>()
    arrayOfAttachment += audio
    arrayOfAttachment += document
    arrayOfAttachment += link
    arrayOfAttachment += note
    arrayOfAttachment += page



    val post1 = WallService.add(Post(1, 1, 1, 1, "22.05.2022", "1",1, 1, true ,1,1,1,
        1, 1, "1", 1, true, 1, null, true,
        true, true, true, true, true, 1, arrayOfAttachment))

    print(post1)

}