class Solution {    
    public int jump(int[] nums) {
        int last = 0;
        int fastIndexValue = 0;
        int count = 0;
        
        for (int start = 0; start < nums.length -1; start++) {
            fastIndexValue = Math.max(fastIndexValue, start + nums[start]);
            
            if (start == last) {
                count++;
                last = fastIndexValue;
            }
        }
        
        return count;
    }
}