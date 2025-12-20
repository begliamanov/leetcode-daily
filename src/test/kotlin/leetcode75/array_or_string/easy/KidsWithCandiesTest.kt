package leetcode75.array_or_string.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class KidsWithCandiesTest {

    private val solution = KidsWithCandies()

    @Test
    @DisplayName("Example 1: Mixed results with multiple kids having greatest")
    fun testExample1() {
        val candies = intArrayOf(2, 3, 5, 1, 3)
        val extraCandies = 3
        val expected = listOf(true, true, true, false, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Example 2: Only one kid can have greatest")
    fun testExample2() {
        val candies = intArrayOf(4, 2, 1, 1, 2)
        val extraCandies = 1
        val expected = listOf(true, false, false, false, false)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Example 3: Multiple kids already have max candies")
    fun testExample3() {
        val candies = intArrayOf(12, 1, 12)
        val extraCandies = 10
        val expected = listOf(true, false, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("All kids can have greatest number")
    fun testAllKidsCanBeGreatest() {
        val candies = intArrayOf(1, 1, 1, 1)
        val extraCandies = 5
        val expected = listOf(true, true, true, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("No extra candies needed - all equal")
    fun testAllEqualNoExtra() {
        val candies = intArrayOf(5, 5, 5)
        val extraCandies = 0
        val expected = listOf(true, true, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Minimum array size (n=2)")
    fun testMinimumArraySize() {
        val candies = intArrayOf(1, 2)
        val extraCandies = 1
        val expected = listOf(true, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Large difference - only max kid can win")
    fun testLargeDifference() {
        val candies = intArrayOf(100, 1, 1, 1)
        val extraCandies = 10
        val expected = listOf(true, false, false, false)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Extra candies exactly bridge the gap")
    fun testExactGap() {
        val candies = intArrayOf(10, 8, 7)
        val extraCandies = 2
        val expected = listOf(true, true, false)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Maximum constraints (large array)")
    fun testLargeArray() {
        val candies = IntArray(100) { 50 }
        candies[0] = 100
        val extraCandies = 50
        val expected = MutableList(100) { true }

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("All kids have zero except one")
    fun testMostlyZeros() {
        val candies = intArrayOf(1, 1, 1, 1, 10)
        val extraCandies = 9
        val expected = listOf(true, true, true, true, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Boundary: Maximum candies and extra values")
    fun testMaximumValues() {
        val candies = intArrayOf(100, 99, 98)
        val extraCandies = 50
        val expected = listOf(true, true, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }

    @Test
    @DisplayName("Boundary: Minimum candies values")
    fun testMinimumValues() {
        val candies = intArrayOf(1, 1, 2)
        val extraCandies = 1
        val expected = listOf(true, true, true)

        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies))
    }
}