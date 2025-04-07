data class Posts(
    val id: Int, val authorId: Int, val authorName: String, val content: String, val published: Long, val likes: Int
)

object WallSevice {

    private var posts = emptyArray<Posts>()
    fun add(post: Posts): Posts {
        posts += post
        return posts.last()
    }

    fun likeByid(id: Int) {
        for ((index, post) in posts.withIndex()){
            if (post.id == id) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }
}

fun main() {
    val post = Posts(1, 1, "author", "content", likes = 0, published = 0)
    val liked = post.copy(likes = post.likes + 1)
    val (id, authorId, _ , content) = post
    println("$id, $authorId, $content")
    println(liked)
    println(post)
}