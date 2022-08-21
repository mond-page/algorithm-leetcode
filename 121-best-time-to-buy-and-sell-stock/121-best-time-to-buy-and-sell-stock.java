class Solution {
    public int maxProfit(int[] prices) {
        int diff = -1;
        int minPrice = 10001;
        int maxPrice = -1;
        for (int idx = 0; idx < prices.length; idx++) {
            if (minPrice > prices[idx]) {
                diff = Math.max(maxPrice - minPrice, diff);
                maxPrice = -1;
                minPrice = prices[idx];
            } else {
                maxPrice = Math.max(maxPrice, prices[idx]);
            }
        }
        diff = Math.max(maxPrice - minPrice, diff);
        return diff < 0 ? 0 : diff;
    }
}