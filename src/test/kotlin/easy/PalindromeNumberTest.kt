package easy

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class PalindromeNumberTest {
    private val palindromeNumber = PalindromeNumber()

    @Test
    fun case1() {
        val x = 121
        val expectedValue = true

        val result = palindromeNumber.isPalindrome(x)
        assertEquals(expectedValue, result)
    }

    @Test
    fun case2() {
        val x = -121
        val expectedValue = false

        val result = palindromeNumber.isPalindrome(x)
        assertEquals(expectedValue, result)
    }

    @Test
    fun case3() {
        val x = 10
        val expectedValue = false

        val result = palindromeNumber.isPalindrome(x)
        assertEquals(expectedValue, result)
    }
}