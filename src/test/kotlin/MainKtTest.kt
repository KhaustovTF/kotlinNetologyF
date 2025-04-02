import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculatePriceShouldNotAddDiscount() {
        val itemPrice = 100
        val itemCount = 1
        val discount = 10
        val discountStart = 1_000
        val level = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)

        assertEquals(90, result)

    }

    @Test
    fun calculatePriceShouldAddDiscount() {
        val itemPrice = 1000
        val itemCount = 1
        val discount = 10
        val discountStart = 1_00
        val level = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)

        assertEquals(891, result)

    }


}