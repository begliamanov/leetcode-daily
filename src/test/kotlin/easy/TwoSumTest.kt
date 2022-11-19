package easy
import easy.TwoSum
import org.junit.Assert.*
import org.junit.Test

internal class TwoSumTest {
    private val twoSum = TwoSum()

    @Test
    fun case1() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expectedValue = intArrayOf(0, 1)

        val result = twoSum.twoSum(nums, target)

        assertArrayEquals(expectedValue, result)
    }

    @Test
    fun case2() {
        val nums = intArrayOf(3,2,4)
        val target = 6
        val expectedValue = intArrayOf(1, 2)

        val result = twoSum.twoSum(nums, target)

        assertArrayEquals(expectedValue, result)
    }

    @Test
    fun case3() {
        val nums = intArrayOf(3,3)
        val target = 6
        val expectedValue = intArrayOf(0, 1)

        val result = twoSum.twoSum(nums, target)

        assertArrayEquals(expectedValue, result)
    }
}