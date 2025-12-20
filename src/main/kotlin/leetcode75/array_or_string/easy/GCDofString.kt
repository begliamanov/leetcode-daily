package leetcode75.array_or_string.easy

/**
 * ## Greatest Common Divisor of Strings
 *
 * For two strings `s` and `t`, we say that **t divides s** if and only if:
 *
 *     s = t + t + ... + t  (one or more repetitions)
 *
 * Given two strings `str1` and `str2`, return the **largest string `x`** such that
 * `x` divides both `str1` and `str2`.
 *
 * ---
 *
 * ### Example 1
 * **Input:** str1 = "ABCABC", str2 = "ABC"
 * **Output:** "ABC"
 *
 * ---
 *
 * ### Example 2
 * **Input:** str1 = "ABABAB", str2 = "ABAB"
 * **Output:** "AB"
 *
 * ---
 *
 * ### Example 3
 * **Input:** str1 = "LEET", str2 = "CODE"
 * **Output:** ""
 *
 * ---
 *
 * ### Constraints
 * - `1 <= str1.length, str2.length <= 1000`
 * - `str1` and `str2` consist of uppercase English letters
 */

class GCDofString {
    fun gcdOfStrings(str1: String, str2: String): String {
        if (str1.isEmpty() || str2.isEmpty()) return ""
        val dividers1 = getDividers(str1)
        val dividers2 = getDividers(str2)
        var gcd = ""
        var max = 0
        dividers1.forEach { i ->
            dividers2.forEach { j ->
                if (i == j && i.length > max) {
                    max = i.length
                    gcd = i
                }
            }
        }
        return gcd
    }

    fun getDividers(str: String): List<String> {
        val divisorsInt = str.length.getAllDivisors()
        val divisors = mutableListOf<String>()
        divisorsInt.forEach {
            val chunks = str.chunked(it)
            if (chunks.areEqual()) {
                divisors.add(chunks[0])
            }
        }
        return divisors
    }

    fun Int.getAllDivisors(): List<Int> {
        val divisors = mutableListOf<Int>(this)
        repeat(this) {
            if (it != 0 && this % it == 0) {
                divisors.add(it)
            }
        }
        return divisors
    }

    fun List<String>.areEqual(): Boolean {
        return all { it == firstOrNull() }
    }
}