package leetcode75.array_or_string

import junit.framework.TestCase.assertEquals
import org.junit.Test

class GCDofStringTest {
    private val gcd = GCDofString()

    @Test
    fun `example 1`() {
        val result = gcd.gcdOfStrings("ABCABC", "ABC")
        assertEquals("ABC", result)
    }

    @Test
    fun `example 2`() {
        val result = gcd.gcdOfStrings("ABABAB", "ABAB")
        assertEquals("AB", result)
    }

    @Test
    fun `example 3 - no common divisor`() {
        val result = gcd.gcdOfStrings("LEET", "CODE")
        assertEquals("", result)
    }

    @Test
    fun `one string empty returns empty`() {
        val result = gcd.gcdOfStrings("", "ABC")
        assertEquals("", result)
    }

    @Test
    fun `both strings same`() {
        val result = gcd.gcdOfStrings("XYZ", "XYZ")
        assertEquals("XYZ", result)
    }


    @Test
    fun `strings with no repeating pattern`() {
        val result = gcd.gcdOfStrings("ABCD", "XYZ")
        assertEquals("", result)
    }

    @Test
    fun `strings with partial overlap but not divisor`() {
        val result = gcd.gcdOfStrings("ABABAB", "ABABA")
        assertEquals("", result)
    }

    @Test
    fun `strings with tricky `() {
        val result = gcd.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX")
        assertEquals("TAUXX", result)
    }

    @Test
    fun `leetcode failed test`() {
        val result = gcd.gcdOfStrings("ABABABAB", "ABAB")
        assertEquals("ABAB", result)
    }
}
