package advent_of_code._2025.day1

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class Day1Test {
    @Test
    fun `test part 1`() {
        val rotations = listOf(
            "L68",
            "L30",
            "R48",
            "L5",
            "R60",
            "L55",
            "L1",
            "L99",
            "R14",
            "L82"
        )

        val day1 = Day1()
        val result = day1.part1(rotations)

        assertEquals(3, result)
    }

    @Test
    fun examplePart2() {
        val rotations = listOf(
            "L68",
            "L30",
            "R48",
            "L5",
            "R60",
            "L55",
            "L1",
            "L99",
            "R14",
            "L82"
        )

        val day1 = Day1()
        val result = day1.part2(rotations)

        assertEquals(6, result)
    }
}