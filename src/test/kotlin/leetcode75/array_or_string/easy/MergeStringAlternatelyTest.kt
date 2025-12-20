package leetcode75.array_or_string.easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MergeStringAlternatelyTest {

    private val merger = MergeStringAlternately()

    @Test
    fun `example 1`() {
        val result = merger.mergeString("abc", "pqr")
        Assertions.assertEquals("apbqcr", result)
    }

    @Test
    fun `example 2`() {
        val result = merger.mergeString("ab", "pqrs")
        Assertions.assertEquals("apbqrs", result)
    }

    @Test
    fun `example 3`() {
        val result = merger.mergeString("abcd", "pq")
        Assertions.assertEquals("apbqcd", result)
    }

    @Test
    fun `one letter strings`() {
        val result = merger.mergeString("a", "z")
        Assertions.assertEquals("az", result)
    }

    @Test
    fun `first string longer`() {
        val result = merger.mergeString("hello", "hi")
        Assertions.assertEquals("hheillo", result)
    }

    @Test
    fun `second string longer`() {
        val result = merger.mergeString("hi", "world")
        Assertions.assertEquals("hwiorld", result)
    }

    @Test
    fun `equal length strings`() {
        val result = merger.mergeString("xyz", "abc")
        Assertions.assertEquals("xaybzc", result)
    }

    @Test
    fun `strings with repeating characters`() {
        val result = merger.mergeString("aaa", "bbb")
        Assertions.assertEquals("ababab", result)
    }

    @Test
    fun `maximum length constraint`() {
        val s1 = "a".repeat(100)
        val s2 = "b".repeat(100)
        val result = merger.mergeString(s1, s2)

        // Result should alternate for 200 chars
        Assertions.assertEquals(200, result.length)
        assert(result.startsWith("ab"))
    }
}