package easy

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val closeToOpen = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        s.forEach {
            if (closeToOpen.containsKey(it)) {
                if (stack.isNotEmpty() && stack.last() == closeToOpen[it]) {
                    stack.removeLastOrNull()
                } else {
                    return false
                }
            } else {
                stack.add(it)
            }
        }
        return stack.isEmpty()
    }
}