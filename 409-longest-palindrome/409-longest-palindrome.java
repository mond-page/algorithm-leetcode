class Solution {
    private int length = 0;
    private boolean oddPosition = false;
    
    public int longestPalindrome(String s) {
        Map<Character, Integer> countingMap = new HashMap<Character, Integer>();
        
        for (int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            countingMap.put(c, countingMap.getOrDefault(c, 0) + 1);
        }
        
        for(Map.Entry<Character, Integer> entry: countingMap.entrySet()) {
            int count = entry.getValue();
            if (count % 2 == 0) {
                addEvenLength(count);
            } else {
                addOddLength(count);
            }
        }
        return length;
    }
    
    private void addOddLength(int value) {
        if (oddPosition) {
            length += value -1;
            return;
        }
        length += value;
        oddPosition = true;
    }
    
    private void addEvenLength(int value) {
        length += value;
    }
}