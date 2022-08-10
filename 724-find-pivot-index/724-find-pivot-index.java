class Solution {    
    public int pivotIndex(int[] nums) {
        for (int idx = 0; idx < nums.length; idx++) {
            if (idx == 0 && onlyRightSubArray(nums)) {
                return 0;
            } else if (idx == nums.length -1 && onlyLeftSubArray(nums)) {
                return nums.length -1;
            } else {
                if (equalsLeftAndRightSubArray(nums, idx)) {
                    return idx;
                }
            }
        }
        return -1;
    }
    
    private boolean onlyRightSubArray(int[] nums) {
        return sumRightSubArray(nums, 1) == 0;
    }
    
    private boolean onlyLeftSubArray(int[] nums) {
        return sumLeftSubArray(nums, nums.length -2) == 0;
    }
    
    private boolean equalsLeftAndRightSubArray(int[] nums, int idx) {
        return sumLeftSubArray(nums, idx -1) == sumRightSubArray(nums, idx +1);
    }
    
    private int sumLeftSubArray(int[] nums, int endIdx) {
        int sum = 0;
        for (int idx = endIdx; idx >= 0; idx--) {
            sum += nums[idx];
        }
        return sum;
    }
    
    private int sumRightSubArray(int[] nums, int startIdx) {
        int sum = 0;
        for (int idx = startIdx; idx < nums.length; idx++) {
            sum += nums[idx];
        }
        return sum;
    }
}