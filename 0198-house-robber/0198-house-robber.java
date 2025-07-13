class Solution {
    public int helper(int[] nums, int index, int[] dp) {
        if(index >= nums.length) return 0;
        if(dp[index] != -1) return dp[index];

        int pick = nums[index] + helper(nums, index+2, dp);
        int notpick = helper(nums, index+1, dp);

        return dp[index] = Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0, dp);
    }
}