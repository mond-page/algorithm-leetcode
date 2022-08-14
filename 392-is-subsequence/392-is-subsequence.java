class Solution {
    public boolean isSubsequence(String s, String t) {
        int stringIdx = -1;
        if (s.isBlank() && t.isBlank()) {
            return true;
        } else if (!s.isBlank() && t.isBlank()) {
            return false;
        }
        
        for (int idx = 0; idx < s.length(); idx++) {
            String character = s.charAt(idx) + "";
            int findIdx = t.indexOf(character, stringIdx + 1);
            if (stringIdx < findIdx) {
                stringIdx = findIdx;
                continue;
            }
            return false;
        }
        
        return true;
    }
}