class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] sArr = new int[26];
        for(int i = 0 ; i < s.length(); i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            sArr[sch - 'a']++;
            sArr[tch - 'a']--;
        }
        for(int num : sArr) {
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
}
