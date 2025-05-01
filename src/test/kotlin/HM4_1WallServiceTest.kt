import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class HM4_1WallServiceTest {

    private var posts = emptyArray<Post>()
    private var unickId = 0

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add() {
        val result = WallService.add(
            Post(
                2, 2, 3, "Post", 4, false, false, PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
                Likes(30, true)
            )
        )

        assertEquals(
            Post(
                2, 2, 3, "Post", 4, false, false, PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
                Likes(30, true)
            ), result
        )
    }

    @Test
    fun updateRealId() {
        WallService.add(
            Post(
                1, 3, 4, "Post", 5, false, false, PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
                Likes(30, true)
            )
        )
        val result = WallService.update(
            Post(
                1,
                3,
                4,
                "another post!",
                12,
                false,
                false,
                PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
                Likes(30, true)
            ),
//            PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
//            Likes(30, true),
        )

        assertEquals(true, result)
    }


    @Test
    fun updateUnrealId() {
//   WallService.add(Post(1,3,4,"Post", 5,false,false))
        val result = WallService.update(
            Post(
                2, 3, 4, "Post", 5, false, false, PhotoAttachment(Photo(1, 1, "sdada", "assdassd")),
                Likes(30, true)
            )
        )

        assertEquals(false, result)
    }
}

