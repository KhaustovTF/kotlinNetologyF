data class Post(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val views: Int,
    val canDelete: Boolean,
    val markedAsAds: Boolean,

    val likes: Likes = Likes(0, true)
)

data class Likes(val count: Int, val userLikes: Boolean)


object WallService {

}

fun main() {

}