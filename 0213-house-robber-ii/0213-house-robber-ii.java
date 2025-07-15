class Solution {
    public int helper(int[] nums, int start, int end, int dp[]) {
        if(start > end) return 0;
        if(start == end) return nums[start];
        if(dp[end] != -1) return dp[end];

        int pick = nums[end] + helper(nums, start, end-2, dp);
        int notpick = helper(nums, start, end-1, dp);

        return dp[end] = Math.max(pick, notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int left = helper(nums, 0, n-2, dp);
        Arrays.fill(dp, -1);
        int right = helper(nums, 1, n-1, dp);
        return Math.max(left, right);
    }
}