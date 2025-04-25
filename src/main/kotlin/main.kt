class Posts(
    val id: Long,
    val authorId: Long,
    val authorName: String,
    val content: String,
    val created: Long,
    val original: Posts?,
    open val likes: Int = 0
)



//interface Posts {
//    val id: Long
//    val authorId: Long
//    val authorName: String
//    val content: String
//    val created: Long
//    val likes: Int
//}
//
//class RegularPost(
//    override val id: Long,
//    override val authorId: Long,
//    override val authorName: String,
//    override val content: String,
//    override val created: Long,
//    override val likes: Int
//) : Posts {
//
//}
//
//
//class Repost(
//    override val id: Long,
//    override val authorId: Long,
//    override val authorName: String,
//    override val content: String,
//    override val created: Long,
//    override val likes: Int,
//    val original: Post
//) : Posts{
//
//}
//
//fun repost(post: Posts) {
//    if (post !is  Repost) {
//        return
//    }
//
//    val repost = post as Repost
//    repost.original
//}

fun main() {
    val post = Posts(1,2,"text", "content", 0, null)
    val repost = Posts(2,2,"text", "content", 0, post)

    val array = arrayOf(post, repost)
    var sum = 0
    for (item in array) {
        sum += (item.likes + (item.original?.likes ?: 0))
    }
    println(sum)
    println(repost)
}
