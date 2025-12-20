package advent_of_code._2025.day1

import advent_of_code.helper.FileReader.readFile

class Day1 {
    fun part1(rotations: List<String>): Int {
        val integers = rotations.rotationsToInts()
        var position = 50
        var zeroCount = 0
        integers.forEach {
            position = (((position + it) % 100) + 100) % 100
            if (position == 0) zeroCount++
        }
        return zeroCount
    }

    fun part2(rotations: List<String>): Int {
        val integers = rotations.rotationsToInts()
        var position = 50
        var zeroCount = 0

        integers.forEach {
            println("position: $position")
            var newPosition = position + it
            println("newPosition: $newPosition")
            while (newPosition > 99) {
                newPosition -= 100
                zeroCount++
                println("newPosition: $newPosition, zeroCount: $zeroCount")
            }
            position = (((newPosition + it) % 100) + 100) % 100
        }

        return zeroCount
    }

    fun List<String>.rotationsToInts() = this.map {
        if (it.startsWith('L'))
            -it.removePrefix("L").toInt()
        else it.removePrefix("R").toInt()
    }
}

fun main() {
    val input1 = readFile("src/main/kotlin/advent_of_code/_2025/day1/input.txt")
        .split("\n")
    val input2 = readFile("src/main/kotlin/advent_of_code/_2025/day1/input_part2.txt")
        .split("\n")
    val result = Day1().part2(input2)
    println(result)
}