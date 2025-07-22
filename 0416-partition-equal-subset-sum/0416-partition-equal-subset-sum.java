class Solution {
    public boolean helper(int[] nums, int target, int n, int[][] dp) {
        if(target == 0) return true;
        if(n == 0) return (nums[0] == target);
        if(dp[n][target] != -1) return (dp[n][target] == 1);
        boolean nottake = helper(nums, target, n-1, dp);
        boolean take = false;
        if(nums[n] <= target)
            take = helper(nums, target-nums[n], n-1, dp);

        dp[n][target] = (take || nottake ? 1 : 0);
        return dp[n][target]==1;
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum%2 == 1) return false;
        sum = sum/2;
        int dp[][] = new int[nums.length][sum +1];
        for(int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(nums, sum, nums.length-1,dp);
    }
}