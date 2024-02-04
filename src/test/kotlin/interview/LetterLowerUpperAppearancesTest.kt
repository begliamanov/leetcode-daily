package interview

import org.junit.Assert.assertEquals
import org.junit.Test

class LetterLowerUpperAppearancesTest {
    val letterLowerUpperAppearances = LetterLowerUpperAppearances()

    @Test
    fun case1() {
        val input = "aaAbcCABBc"
        val expected = 2

        val actual = letterLowerUpperAppearances.solution(input)

        assertEquals(expected, actual)
    }

    @Test
    fun case2() {
        val input = "xyzXYZabcABC"
        val expected = 6

        val actual = letterLowerUpperAppearances.solution(input)

        assertEquals(expected, actual)
    }

    @Test
    fun case3() {
        val input = "ABCabcAefG"
        val expected = 0

        val actual = letterLowerUpperAppearances.solution(input)

        assertEquals(expected, actual)
    }
}