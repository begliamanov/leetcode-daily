package leetcode75.array_or_string.easy

/**
 * ## Merge String Alternately
 *
 * You are given two strings **word1** and **word2**.
 * Merge the strings by adding letters in alternating order, starting with **word1**.
 * If one string is longer, append the remaining characters at the end.
 *
 * **Return:** the merged string.
 *
 * ---
 *
 * ### Example 1
 * **Input:** word1 = "abc", word2 = "pqr"
 * **Output:** "apbqcr"
 *
 * Merging visualization:
 * ```
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * ```
 *
 * ---
 *
 * ### Example 2
 * **Input:** word1 = "ab", word2 = "pqrs"
 * **Output:** "apbqrs"
 *
 * Because `word2` is longer, "rs" is appended at the end.
 * ```
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * ```
 *
 * ---
 *
 * ### Example 3
 * **Input:** word1 = "abcd", word2 = "pq"
 * **Output:** "apbqcd"
 *
 * Because `word1` is longer, "cd" is appended at the end.
 * ```
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 * ```
 *
 * ---
 *
 * ### Constraints
 * - `1 <= word1.length, word2.length <= 100`
 * - `word1` and `word2` consist of lowercase English letters
 */

class MergeStringAlternately {
    fun mergeString(s1: String, s2: String): String {
        s1.toCharArray()
        s2.toCharArray()
        val maxLen = if (s1.length > s2.length) s1.length else s2.length
        val combinedArray = mutableListOf<Char>()
        repeat(maxLen) { index ->
            if (index < s1.length) {
                combinedArray.add(s1[index])
            }
            if (index < s2.length) {
                combinedArray.add(s2[index])
            }
        }
        return combinedArray.joinToString("")
    }
}