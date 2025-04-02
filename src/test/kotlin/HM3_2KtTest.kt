import org.junit.Test

import org.junit.Assert.*

class HM3_2KtTest {

    @Test
    fun algoritmRaschetaMasterCardWithoutVipDiscount() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "MasterCard"
        val transfer = 35_000
        var transferInMonth = 45_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(50, result)
    }

    @Test
    fun algoritmRaschetaMasterCardWithVipDiscount() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "MasterCard"
        val transfer = 35_000
        var transferInMonth = 40_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(0, result)
    }


    @Test
    fun algoritmRaschetaMasterCardWithhoutVipDiscountMonth() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "MasterCard"
        val transfer = 700
        var transferInMonth = 80_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(24, result)
    }

    @Test
    fun algoritmRaschetaMasterCardDailyLimitOver() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "MasterCard"
        val transfer = 190_000
        var transferInMonth = 80_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(-1, result)
    }

    @Test
    fun algoritmRaschetaMasterCardMonthLimitOver() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "MasterCard"
        val transfer = 10_000
        var transferInMonth = 595_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(-1, result)
    }


    @Test
    fun algoritmRaschetaVisaDiscount() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Visa"
        val transfer = 30_000
        var transferInMonth = 40_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(225, result)
    }


    @Test
    fun algoritmRaschetaVisaMonthLimitOver() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Visa"
        val transfer = 10_000
        var transferInMonth = 699_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(-1, result)
    }


    @Test
    fun algoritmRaschetaVisaDailyLimitOver() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Visa"
        val transfer = 170_000
        var transferInMonth = 0

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(-1, result)
    }

    @Test
    fun algoritmRaschetaVisaDiscountTooSmall() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Visa"
        val transfer = 4_000
        var transferInMonth = 40_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(35, result)
    }

    @Test
    fun algoritmRaschetaMir() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Mir"
        val transfer = 50_000
        var transferInMonth = 50_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(0, result)
    }

    @Test
    fun algoritmRaschetaMirDailyLimitOver() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Mir"
        val transfer = 170_000
        var transferInMonth = 0

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(-1, result)
    }

    @Test
    fun algoritmRaschetaMirMonthLimitOver() {
        val dailyLimit = 150_000
        val monthLimit = 600_000

        val cardType = "Mir"
        val transfer = 10_000
        var transferInMonth = 699_000

        val result = algoritmRascheta(cardType, transfer, transferInMonth)

        assertEquals(-1, result)
    }
}