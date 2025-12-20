package leetcode75.array_or_string.easy

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CanPlaceFlowerTest {

    private val solution = CanPlaceFlower()

    @Test
    @DisplayName("Example 1: Can plant 1 flower in [1,0,0,0,1]")
    fun testExample1() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 1

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Example 2: Cannot plant 2 flowers in [1,0,0,0,1]")
    fun testExample2() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 1)
        val n = 2

        assertFalse(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("No flowers needed (n=0)")
    fun testNoFlowersNeeded() {
        val flowerbed = intArrayOf(1, 0, 1, 0, 1)
        val n = 0

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("All empty flowerbed [0,0,0]")
    fun testAllEmpty() {
        val flowerbed = intArrayOf(0, 0, 0)
        val n = 2

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("All empty, trying to plant too many")
    fun testAllEmptyTooMany() {
        val flowerbed = intArrayOf(0, 0, 0)
        val n = 3

        assertFalse(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("All planted [1,1,1,1]")
    fun testAllPlanted() {
        val flowerbed = intArrayOf(1, 1, 1, 1)
        val n = 1

        assertFalse(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Single empty plot [0]")
    fun testSingleEmpty() {
        val flowerbed = intArrayOf(0)
        val n = 1

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Single planted plot [1]")
    fun testSinglePlanted() {
        val flowerbed = intArrayOf(1)
        val n = 1

        assertFalse(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Two empty plots [0,0]")
    fun testTwoEmpty() {
        val flowerbed = intArrayOf(0, 0)
        val n = 1

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Edge case: Planted at start [1,0,0]")
    fun testPlantedAtStart() {
        val flowerbed = intArrayOf(1, 0, 0)
        val n = 1

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Edge case: Planted at end [0,0,1]")
    fun testPlantedAtEnd() {
        val flowerbed = intArrayOf(0, 0, 1)
        val n = 1

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Edge case: Empty at boundaries [0,1,0]")
    fun testEmptyAtBoundaries() {
        val flowerbed = intArrayOf(0, 1, 0)
        val n = 1

        assertFalse(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Alternating pattern [1,0,1,0,1]")
    fun testAlternatingPattern() {
        val flowerbed = intArrayOf(1, 0, 1, 0, 1)
        val n = 1

        assertFalse(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Large gap in middle [1,0,0,0,0,0,1]")
    fun testLargeGap() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 0, 0, 1)
        val n = 2

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Multiple gaps [0,0,1,0,0,0,1,0,0]")
    fun testMultipleGaps() {
        val flowerbed = intArrayOf(0, 0, 1, 0, 0, 0, 1, 0, 0)
        val n = 3

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Long empty flowerbed [0,0,0,0,0,0,0]")
    fun testLongEmpty() {
        val flowerbed = intArrayOf(0, 0, 0, 0, 0, 0, 0)
        val n = 4

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Long empty, request exactly max possible")
    fun testLongEmptyExactMax() {
        val flowerbed = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0)
        val n = 4

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Pattern with consecutive zeros [1,0,0,0,0,1,0,0]")
    fun testConsecutiveZeros() {
        val flowerbed = intArrayOf(1, 0, 0, 0, 0, 1, 0, 0)
        val n = 2

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Already optimal planting [1,0,1,0,1,0,1]")
    fun testOptimalPlanting() {
        val flowerbed = intArrayOf(1, 0, 1, 0, 1, 0, 1)
        val n = 0

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }

    @Test
    @DisplayName("Need 0 flowers in empty bed")
    fun testNeedZeroInEmpty() {
        val flowerbed = intArrayOf(0, 0, 0, 0)
        val n = 0

        assertTrue(solution.canPlaceFlowers(flowerbed, n))
    }
}