class Solution {
    public int helper(int[] nums, int target, int index) {
        
        int[][] dp = new int[nums.length][target+1];

        if(nums[0] == 0) dp[0][0] = 2;
        else dp[0][0] = 1;

        if(nums[0] != 0 && target >= nums[0]) dp[0][nums[0]] = 1;

        for(int  i = 1; i < nums.length; i++) {
            for(int j = 0; j <= target; j++) {
                int pick = 0;
                if(nums[i] <= j) pick = dp[i-1][j-nums[i]];
                int notpick = dp[i-1][j];

                dp[i][j] = pick+notpick;
            }
        }

        return dp[nums.length-1][target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }

        if(sum-target < 0) return 0;
        if((sum-target)%2 == 1) return 0;

        int s = (sum-target)/2;

        return helper(nums, s, nums.length-1);
    }
}