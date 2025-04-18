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
    private var posts = emptyArray<Post>()
    private var unickId = 0

    fun clear(){
        posts = emptyArray()
        unickId == 0
    }

    fun add(post: Post): Post {
        posts += post.copy(++unickId, likes = post.likes.copy())
        return posts.last()
    }

    fun update(post2: Post): Boolean {
        for ((index,post) in posts.withIndex()) {
            if (post2.id == post.id){
                posts[index] = post2.copy(likes = post2.likes.copy())
                return true
            }
        }
        return false
    }

    fun printPosts() {
        for (post in posts){
            print(post)
            println()
        }
    }
}

fun main() {
    WallService.add(Post(1,2,3,"Post", 4, false, false, Likes(30, true)))
    WallService.add(Post(1,3,4,"Post 2", 5, false, false))
    println(WallService.update(Post(2, 3, 4, "another post!", 12, false, false, Likes(31, false))))
    WallService.printPosts()
}