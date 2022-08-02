// time complexity  : O(n)
// space complexity : O(1)
class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for(int idx = 0; idx < s.length / 2; idx++) {
            char temp = s[idx];
            s[idx] = s[length - idx -1];
            s[length - idx -1] = temp;
        }
        
        System.out.println(s);
    }
}