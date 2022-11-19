package easy

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class LongestCommonPrefixTest {
    private val longestCommonPrefix = LongestCommonPrefix()

    @Test
    fun case1() {
        val input = arrayOf("flower","flow","flight")
        val expectedValue = "fl"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        assertEquals(expectedValue, result)
    }

    @Test
    fun case2() {
        val input = arrayOf("dog","racecar","car")
        val expectedValue = ""

        val result = longestCommonPrefix.longestCommonPrefix(input)

        assertEquals(expectedValue, result)
    }
}