class Solution {    
    public int jump(int[] nums) {
        int last = 0;
        int maxJumpValue = 0;
        int count = 0;
        
        for (int start = 0; start < nums.length -1; start++) {
            maxJumpValue = Math.max(maxJumpValue, start + nums[start]);
            
            if (start == last) {
                count++;
                last = maxJumpValue;
            }
        }
        
        return count;
    }
}