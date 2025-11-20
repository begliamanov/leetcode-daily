package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountUniqueValuesTest {

    private val counter = CountUniqueValues()

    @Test
    fun `test empty array`() {
        val result = counter.countUniqueValues(arrayOf())
        assertEquals(0, result)
    }

    @Test
    fun `test all unique values`() {
        val result = counter.countUniqueValues(arrayOf(1, 2, 3, 4, 5))
        assertEquals(5, result)
    }

    @Test
    fun `test all same values`() {
        val result = counter.countUniqueValues(arrayOf(7, 7, 7, 7))
        assertEquals(1, result)
    }

    @Test
    fun `test mixed duplicates`() {
        val result = counter.countUniqueValues(arrayOf(1, 2, 2, 3, 4, 4, 5))
        assertEquals(5, result)
    }

    @Test
    fun `test negative and positive values`() {
        val result = counter.countUniqueValues(arrayOf(-1, -1, 0, 1, 1))
        assertEquals(3, result)
    }
}