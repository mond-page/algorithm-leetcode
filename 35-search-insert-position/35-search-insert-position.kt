class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left: Int = 0
        var pivot: Int = 0
        var right: Int = nums.size -1
        
        while (left <= right) {
            pivot = left + (right - left) / 2
            if (nums[pivot] == target) {
                return pivot
            } else if (nums[pivot] < target) {
                left = pivot + 1
            } else {
                right = pivot - 1
            }
        }
        return left
    }
}