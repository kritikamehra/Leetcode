class Solution {
    public boolean helper(int[] nums, int target) {

        boolean[][] dp = new boolean[nums.length][target+1];
        for(int i = 0; i < nums.length; i++) {
            Arrays.fill(dp[i], false);
        }
        for(int i = 0; i < nums.length; i++) {
            dp[i][0] = true;
        }
        for(int i = 0; i <= target; i++) {
            dp[0][i] = (nums[0] == i);
        }
        

        for(int i = 1; i < nums.length; i++) {
            for(int j = 1; j <= target; j++) {
                boolean nottake = dp[i-1][j];
                boolean take = false;
                if(nums[i] <= j)
                    take = dp[i-1][j-nums[i]];

                dp[i][j] = take || nottake;
            }
        }
        return dp[nums.length-1][target];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum%2 == 1) return false;
        sum = sum/2;
        
        return helper(nums, sum);
    }
}