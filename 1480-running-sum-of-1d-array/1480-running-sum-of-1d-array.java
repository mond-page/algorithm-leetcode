class Solution {
    public int[] runningSum(int[] nums) {
        int[] copy = new int[nums.length];
        int sum = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            sum += nums[idx];
            copy[idx] = sum;
        }
        
        return copy;
    }
}