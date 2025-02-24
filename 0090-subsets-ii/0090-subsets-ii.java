class Solution {
    public void helper(int nums[], Set<List<Integer>> hs, List<Integer> temp, int index) {
        if(index == nums.length) {
            hs.add(new ArrayList<>(temp));
            return;
        }

        //not pick
        helper(nums, hs, temp, index+1);
        //pick
        temp.add(nums[index]);
        helper(nums, hs, temp, index+1);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> hs = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, hs, temp, 0);
        List<List<Integer>> ans = new ArrayList<>(hs);
        return ans;
    }
}