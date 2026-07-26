class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((num1, num2) -> map.get(num2) - map.get(num1));
        int[] arr = new int[k];
        for(int idx = 0; idx < k; idx++) {
            arr[idx] = list.get(idx);
        }
        return arr;
    }
}
