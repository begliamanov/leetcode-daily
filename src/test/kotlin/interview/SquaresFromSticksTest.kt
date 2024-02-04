package interview

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class SquaresFromSticksTest {
    val squaresFromSticks = SquaresFromSticks()

    @Test
    fun case1() {
        val input1 = 10
        val input2 = 21
        val expected = 7

        val actual = squaresFromSticks.solution(input1, input2)

        assertEquals(expected, actual)
    }

    @Test
    fun case2() {
        val input1 = 13
        val input2 = 11
        val expected = 5

        val actual = squaresFromSticks.solution(input1, input2)

        assertEquals(expected, actual)
    }

    @Test
    fun case3() {
        val input1 = 2
        val input2 = 1
        val expected = 0

        val actual = squaresFromSticks.solution(input1, input2)

        assertEquals(expected, actual)
    }

    @Test
    fun case4() {
        val input1 = 1
        val input2 = 8
        val expected = 2

        val actual = squaresFromSticks.solution(input1, input2)

        assertEquals(expected, actual)
    }
}