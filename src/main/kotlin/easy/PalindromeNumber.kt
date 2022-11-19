package easy

import java.lang.StringBuilder

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x.toString() == x.toString().reversed()) {
            return true
        }
        return false
    }
}