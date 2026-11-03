class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for(int idx = 0 ; idx < s.length(); idx++) {
            arr[s.charAt(idx) - 'a']++;
            arr[t.charAt(idx) - 'a']--;
        }
        for(int num : arr) {
            if(num != 0) {
                return false;
            }
        }
        return true;
    }
}
