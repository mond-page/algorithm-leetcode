class Solution {
    public int maxArea(int[] height) {
        int maxValue = 0;
        int left = 0;
        int right = height.length -1;
        
        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            maxValue = Math.max(maxValue, minHeight * (right - left));
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxValue;
    }
}