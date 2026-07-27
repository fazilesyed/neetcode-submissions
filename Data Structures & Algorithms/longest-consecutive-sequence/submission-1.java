class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int cnt = 1;
        int max = 1;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length -1; i++) {
            if(nums[i] == nums[i+1]-1) {
                cnt++;
                max = Math.max(cnt, max);
            }else if(nums[i] == nums[i+1]) {
                continue;
            }else {
                cnt = 1;
            }
        }
        return max;
    }
}
