class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length;i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int l = i + 1, r = nums.length - 1, sum;
            while(l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) {
                    r--;
                }else if(sum < 0) {
                    l++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    Collections.addAll(list, nums[i], nums[l], nums[r]);
                    set.add(list);
                    l++;
                    r--;
                }
            }
        }
        System.out.println(set);
        List<List<Integer>> res = new ArrayList<>();
        for(List<Integer> temp : set) {
            res.add(temp);
        }
        return res;
    }
}
