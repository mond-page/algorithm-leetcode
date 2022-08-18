class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, startIndex = 0;
        int length = gas.length;
        int[] diff = diffArray(gas, cost, length);
        
        if (Arrays.stream(diff).sum() < 0) {
            return -1;
        }
        
        for (int idx = 0; idx < length; idx++) {
            if (total + diff[idx] < 0) {
                total = 0;
                startIndex = idx + 1;
                continue;
            }
            total += diff[idx];
        }
        
        return startIndex == length ? -1 : startIndex;
    }
    
    private int[] diffArray(int[] gas, int[] cost, int length) {
        int[] diff = new int[length];
        for (int idx = 0; idx < length; idx++) {
            diff[idx] = gas[idx] - cost[idx];
        }
        
        return diff;
    }
}