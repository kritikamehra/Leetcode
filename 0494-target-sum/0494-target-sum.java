class Solution {
    public int helper(int[] nums, int target, int index) {
        
        int[] dp = new int[target+1];

        if(nums[0] == 0) dp[0] = 2;
        else dp[0] = 1;

        if(nums[0] != 0 && target >= nums[0]) dp[nums[0]] = 1;

        for(int  i = 1; i < nums.length; i++) {
            int[] temp = new int[target+1];
            for(int j = 0; j <= target; j++) {
                int pick = 0;
                if(nums[i] <= j) pick = dp[j-nums[i]];
                int notpick = dp[j];

                temp[j] = pick+notpick;
            }
            dp = temp;
        }

        return dp[target];
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