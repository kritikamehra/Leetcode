class Solution {
    public int helper(int[] nums, int start, int end, int[] dp) {
        
        if(end < start) return 0; 
        if(dp[end] != -1) return dp[end];

        int h1 = nums[end] + helper(nums, start, end-2, dp);
        int h2 = helper(nums, start, end-1, dp);

        return dp[end] = Math.max(h1, h2);
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int h1 = helper(nums, 0, nums.length-2, dp);
        Arrays.fill(dp, -1);
        int h2 = helper(nums, 1, nums.length-1, dp);
        return Math.max(h1, h2);
    }
}