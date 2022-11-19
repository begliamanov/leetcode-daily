package easy

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class RomanToIntegerTest {
    private val romanToInteger = RomanToInteger()

    @Test
    fun case1() {
        val input = "III"
        val expectedValue = 3

        val result = romanToInteger.romanToInt(input)

        assertEquals(expectedValue, result)
    }

    @Test
    fun case2() {
        val input = "LVIII"
        val expectedValue = 58

        val result = romanToInteger.romanToInt(input)

        assertEquals(expectedValue, result)
    }

    @Test
    fun case3() {
        val input = "MCMXCIV"
        val expectedValue = 1994

        val result = romanToInteger.romanToInt(input)

        assertEquals(expectedValue, result)
    }
}