package easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var commonPrefix = strs[0]
        strs.forEach {
            commonPrefix = it.commonPrefixWith(commonPrefix)
        }
        return return commonPrefix
    }
}