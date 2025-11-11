package easy


import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ValidAnagramTest {
    private val validAnagram = ValidAnagram()

    @ParameterizedTest
    @CsvSource(
        "'', '', true",
        "'aaz', 'zza', false",
        "'anagram', 'nagaram', true",
        "'Listen', 'Silent', true",
        "'conversation', 'voices rant on', true",
        "'abc!', 'cba', false",
        "'aabbcc', 'aabbc', false"
    )
    fun testAnagrams(a: String, b: String, expected: Boolean) {
        Assertions.assertEquals(expected, validAnagram.validateAnagram(a to b))
    }
}