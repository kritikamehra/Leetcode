class Solution {
    public int helper(int[] nums, int start, int end) {
        int n = end-start+1;
        int[] dp = new int[n];
        if(n == 1) return nums[start]; 
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);

        for(int i = start+2; i <= end; i++) {
            int pick = nums[i] + dp[i-start-2];
            int notpick = dp[i-start-1];
            dp[i-start] = Math.max(pick, notpick);
        }

        return dp[n-1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int left = helper(nums, 0, n-2);
        int right = helper(nums, 1, n-1);
        return Math.max(left, right);
    }
}