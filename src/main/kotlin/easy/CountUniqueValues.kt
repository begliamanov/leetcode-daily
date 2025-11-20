package easy

class CountUniqueValues {
    fun countUniqueValues(numbers: Array<Int>): Int {
        if (numbers.isEmpty()) return 0
        var pointer = 0
        for (i in 1..<numbers.size) {
            if (numbers[pointer] != numbers[i]) {
                pointer++
                numbers[pointer] = numbers[i]
            }
        }
        return pointer + 1
    }
}