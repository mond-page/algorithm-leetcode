class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { idx, value ->
            val secondIndex = nums.indexOf(target - value)
            if (secondIndex != -1 && secondIndex != idx) {
                return intArrayOf(idx, secondIndex)
            }
        }
        return intArrayOf()
    }
}