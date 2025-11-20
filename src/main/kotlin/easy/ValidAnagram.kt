package easy

class ValidAnagram {
    fun validateAnagram(pair: Pair<String, String>) =
        pair.first.cleaned().splitIntoMap() == pair.second.cleaned().splitIntoMap()


    private fun String.cleaned() = lowercase().replace(" ", "")

    private fun String.splitIntoMap() = groupingBy { it }.eachCount()
}