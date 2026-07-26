class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        /*Arrays.sort(strs, (s1, s2) -> {
            if(s1.length() != s2.length()) {
                return s1.length()-s2.length();
            }
            return s1.compareTo(s2);
        });*/
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++) {
            String oldStr = strs[i];
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String newStr = new String(chArr);
            map.putIfAbsent(newStr, new ArrayList<>());
            map.get(newStr).add(oldStr);
        }
        return new ArrayList<>(map.values());
    }
}
