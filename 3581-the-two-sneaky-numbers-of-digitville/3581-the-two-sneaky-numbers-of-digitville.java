class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(mp.containsKey(nums[i])) 
                ans[k++] = nums[i];
            else
                mp.put(nums[i], 1);
        }
        return ans;
    }
}