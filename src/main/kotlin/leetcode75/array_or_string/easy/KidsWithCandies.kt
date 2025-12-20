package leetcode75.array_or_string.easy

class KidsWithCandies {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        return candies.map { (it + extraCandies) >= max }
    }
}