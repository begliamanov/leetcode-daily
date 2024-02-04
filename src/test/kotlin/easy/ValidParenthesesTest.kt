package easy

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class ValidParenthesesTest {
    private val validParentheses = ValidParentheses()

    @Test
    fun case1() {
        val input = "()"
        val expectedValue = true

        val result = validParentheses.isValid(input)

        assertEquals(expectedValue, result)
    }

    @Test
    fun case2() {
        val input = "()[]{}"
        val expectedValue = true

        val result = validParentheses.isValid(input)

        assertEquals(expectedValue, result)
    }

    @Test
    fun case3() {
        val input = "(]"
        val expectedValue = false

        val result = validParentheses.isValid(input)

        assertEquals(expectedValue, result)
    }

    @Test
    fun case4() {
        val input = "([)]"
        val expectedValue = false

        val result = validParentheses.isValid(input)

        assertEquals(expectedValue, result)
    }

}