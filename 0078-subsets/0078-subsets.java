class Solution {
    public void calc(List<List<Integer>> ans, List<Integer> temp, int nums[], int index) {
        if(index == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // not pick
        calc(ans, temp, nums, index+1);
        
        //pick
        temp.add(nums[index]);
        calc(ans, temp, nums, index+1);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        calc(ans, temp, nums, 0);
        return ans;
    }
}