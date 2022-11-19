package easy

class RomanToInteger {
    fun romanToInt(s: String): Int {
        var prev = 0
        var fullNum = 0
        s.split("").reversed().map { romanNum ->
            val num = romanNumConverter(romanNum)
            if (num < prev) {
                fullNum -= num
            } else {
                fullNum += num
            }
            prev = num
        }
        return fullNum
    }

    private fun romanNumConverter(romanNumber: String) = when (romanNumber) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> 0
    }

}