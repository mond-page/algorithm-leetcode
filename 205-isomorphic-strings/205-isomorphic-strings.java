class Solution {
    public boolean isIsomorphic(String s, String t) {    
        Map<Character, Integer> mapByS = new HashMap<>();
        Map<Character, Integer> mapByT = new HashMap<>();
        
        String replaceS = "";
        String replaceT = "";
        
        for (int idx = 0; idx < s.length(); idx++) {
            replaceS += replaceString(mapByS, s.charAt(idx)) + ",";
            replaceT += replaceString(mapByT, t.charAt(idx)) + ",";
        }
        
        return replaceS.equals(replaceT);
    }
    
    private int replaceString(Map<Character, Integer> map, Character c) {
        if (map.get(c) == null) {
            map.put(c, map.size());
        }
        return map.get(c);
    }
}