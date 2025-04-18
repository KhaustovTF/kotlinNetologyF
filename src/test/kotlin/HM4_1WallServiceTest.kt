import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class HM4_1WallServiceTest {

  private var posts = emptyArray<Post>()
  private var unickId = 0

  @Before
  fun clearBeforeTest() {
   WallService.clear()
  }

 @Test
 fun add() {
  val result = WallService.add(Post(2,2,3,"Post", 4, false, false))

  assertEquals(Post(2, 2, 3, "Post", 4, false, false), result)
 }

 @Test
 fun updateRealId() {
  WallService.add(Post(1,3,4,"Post", 5,false,false))
  val result = WallService.update(Post(1, 3, 4, "another post!", 12, false, false))

  assertEquals(true, result)
 }


 @Test
 fun updateUnrealId() {
//   WallService.add(Post(1,3,4,"Post", 5,false,false))
  val result = WallService.update(Post(2,3,4,"Post", 5,false,false))

  assertEquals(false, result)
 }
}

