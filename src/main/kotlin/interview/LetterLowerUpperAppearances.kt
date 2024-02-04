package interview

/**
 * You are given a string letters made of N English letters. Count the number of different letters that appear in both uppercase and lowercase where all lowercase occurrences of the given letter appear before any uppercase occurrence.
 * For example, for letters = "aaAbcCABBc" the answer is 2. The
 * condition is met for letters 'a' and "b', but not for 'c.
 * Write a function:
 * fun solution(letters: String): Int
 * that, given a string letters, returns the number of different letters fulfilling the conditions above.
 *
 * Examples:
 * 1. Given letters = "aaAbcCABBc", the function should return 2,
 * as explained above.
 * 2. Given letters = "xyzXYZabcABC", the function should return 6.
 * 3. Given letters = "ABCabcAefG", the function should return 0.
 *
 * Write an efficient algorithm for the following assumptions:
 * • N is an integer within the range (1.100,000);
 * • string letters is made only of letters (a-z and/or
 */

class LetterLowerUpperAppearances {
    fun solution(letters: String): Int {
        val lowercaseHolder = mutableListOf<Char>()
        val upperCase = mutableListOf<Char>()
        val pair = mutableListOf<Char>()

        letters.forEach { char ->
            if (char.isLowerCase()) {
                if (!upperCase.contains(char.uppercaseChar())) {
                    lowercaseHolder.add(char)
                }
                if (pair.contains(char)) {
                    pair.remove(char)
                }
            } else {
                if (lowercaseHolder.contains(char.lowercaseChar()) && !pair.contains(char.lowercaseChar())) {
                    pair.add(char.lowercaseChar())
                } else {
                    upperCase.add(char)
                }
            }
        }
        return pair.count()
    }
}