package data

interface Attachment{
    val type: String
    }

data class PostAttachment (
    val id: Int,
    val album_id: Int,
    val owner_id: Int,
    val user_id: Int,
)
data class AudioAttachment(
    override val type: String = "audio",
    val audio: PostAttachment = PostAttachment(3,1,1,9)
) : Attachment

data class DocumentAttachment(
    override val type: String = "document",
    val link: PostAttachment = PostAttachment(2,10,1,1)
) : Attachment

data class LinkAttachment(
    override val type: String = "link",
    val link: PostAttachment = PostAttachment(2,1,11,1)
) : Attachment

data class NoteAttachment(
    override val type: String = "note",
    val note: PostAttachment = PostAttachment(5,2,1,1)
) : Attachment

data class PageAttachment(
    override val type: String = "page",
    val page: PostAttachment = PostAttachment(3,1,1,1)
) : Attachment