class Solution {
    fun singleNumber(nums: IntArray): Int {
        val notDuplicateList = arrayListOf<Int>()
        
        for (num in nums) {
            if (notDuplicateList.contains(num)) {
                notDuplicateList.remove(num)
            } else {
                notDuplicateList.add(num)
            }
        }
        return notDuplicateList.first()
    }
}