data class Post(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String?,
    val views: Int?,
    val canDelete: Boolean,
    val markedAsAds: Boolean,
    val attachment: Attachment?,

    val likes: Likes = Likes(0, true)
)

data class Likes(val count: Int, val userLikes: Boolean)


abstract class Attachment {
    abstract val type: String


}

data class PhotoAttachment(val photo: Photo) : Attachment() {
    override val type: String = "Photo"
}

data class Photo(val id: Int, val ownerId: Int, val photo130: String, val photo604: String)

data class VideoAttachment(val video: Video) : Attachment() {
    override val type: String = "Video"
}

data class Video(val id: Int, val ownerId: Int, val name: String, val duration: Int)

data class StickerAttachment(val sticker: Sticker) : Attachment() {
    override val type: String = "Sticker"
}

data class Sticker(val id: Int, val ownerId: Int, val stickerId: Int)

data class AudioAttachment(val audio: Audio) : Attachment() {
    override val type: String = "Audio"
}

data class Audio(val id: Int, val ownerId: Int, val artist: String, val date: Int)

data class FileAttachment(val file: File) : Attachment() {
    override val type: String = "File"
}

data class File(val id: Int, val ownerId: Int, val title: String, val size: Int, val ext: String)

data class Comment(
    val id: Int,
    val fromId: Int,
    val text: String?,
    val date: Int
)

class PostNotFoundException(message: String) : Exception(message)

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var unickId = 1

    fun getUnickId() = unickId

    fun clear() {
        posts = emptyArray()
        unickId = 1
    }

    fun add(post: Post): Post {
        posts += post
        unickId++
        return posts.last()
    }

    fun update(post2: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post2.id == post.id) {
                posts[index] = post2
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (post.id == postId) {
                comments += comment
                return comment
            }
        }
        throw PostNotFoundException("Post with id: ${postId} is not found")
    }

    fun printPosts() {
        for (post in posts) {
            print(post)
            println()
        }
    }
}

fun main() {
    WallService.add(
        Post(
            WallService.getUnickId(),
            5,
            6,
            "Post",
            7,
            false,
            false,
            FileAttachment(File(1, 1, "Troyan", 77, ".exe")),
            Likes(30, true)
        )
    )

    WallService.add(
        Post(
            WallService.getUnickId(),
            4,
            5,
            "Post",
            6,
            false,
            false,
            AudioAttachment(Audio(1, 1, "Queen", 77)),
            Likes(30, true)
        )
    )

    WallService.add(
        Post(
            WallService.getUnickId(),
            3,
            4,
            "Post",
            5,
            false,
            false,
            StickerAttachment(Sticker(1, 1, 25)),
            Likes(30, true)
        )
    )
    WallService.add(
        Post(
            WallService.getUnickId(),
            2,
            3,
            "Post",
            4,
            false,
            false,
            PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
            Likes(30, true)
        )
    )
    WallService.add(
        Post(
            WallService.getUnickId(),
            3,
            4,
            "Post 2",
            5,
            false,
            false,
            VideoAttachment(Video(32, 42, "Kapibara", 700)),
            Likes(30, true)
        )
    )
    println(
        WallService.update(
            Post(
                3,
                3,
                4,
                "another post!",
                12,
                false,
                false,
                PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
                Likes(31, false)
            )
        )
    )
    WallService.printPosts()


    try {
        val comment = WallService.createComment(22, Comment(1, 2, "perviy", 333))
        println(comment)
    } catch (e: PostNotFoundException) {
        println(e.message)
    }
}




