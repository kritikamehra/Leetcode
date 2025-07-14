class Solution {
    public int helper(int[] nums, int start, int end) {
        
        int len = end-start+1;
        int[] dp = new int[len];

        dp[0] = nums[start];
        if(len == 1) return dp[0];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for(int i = start+2; i <= end; i++) {
            int h1 = nums[i] + dp[i-start-2];
            int h2 = dp[i-start-1];
            dp[i-start] = Math.max(h1, h2);
        }

        return dp[len-1];
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        
        int h1 = helper(nums, 0, nums.length-2);
        int h2 = helper(nums, 1, nums.length-1);
        return Math.max(h1, h2);
    }
}