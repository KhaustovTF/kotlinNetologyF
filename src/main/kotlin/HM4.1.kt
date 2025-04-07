data class Post(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val likes: Int,
    val userLikes: Boolean,
    val views: Int,
    val canDelete: Boolean,
    val markedAsAds: Boolean
)

object WallService {
    private var posts = emptyArray<Posts>()


}

fun main() {
val post = Post(123, 321, 222, "New post!", 999, true, 1000, false, false)
val liked = post.copy(likes = post.likes + 1)
    println(liked)
    println(post)
}