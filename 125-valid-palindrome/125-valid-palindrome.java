// time complexity  : O(n)
// space complexity : O(1)

class Solution {
    public boolean isPalindrome(String s) {
        String convert = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = convert.length();
        
        for(int idx = 0; idx < length / 2; idx++) {
            if (convert.charAt(idx) != convert.charAt(length - 1 - idx)) {
                return false;
            }
        }
        
        return true;
    }
}