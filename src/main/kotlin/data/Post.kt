package data

data class Post(
    var id: Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: String,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val comments: Any,
    val copyright: Any,
    val likes: Any,
    val reposts: Any,
    val views: Any,
    val post_type: String,
    val post_source: Any,
    val geo: Any,
    val signer_id: Int,
    val copy_history: Array<Post>?,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val postponed_id: Int
)

