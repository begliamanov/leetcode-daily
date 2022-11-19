class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { firstIndex, first  ->
            nums.forEachIndexed { secondIndex, second ->
                if (first + second == target && firstIndex != secondIndex) {
                    return intArrayOf(firstIndex, secondIndex)
                }
            }
        }
        return intArrayOf()
    }
}
