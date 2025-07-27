class Solution {
    public int helper(int[] coins, int amount) {

        int dp[] = new int[amount+1];
        dp[0] = 0;

        for(int j = 1; j <= amount; j++) {
            int mini =Integer.MAX_VALUE;
            for(int i = 0; i < coins.length; i++) {
                int ans = Integer.MAX_VALUE;
                if(j >= coins[i])
                    ans = dp[j-coins[i]];

                if(ans != Integer.MAX_VALUE)
                    mini = Math.min(mini, 1+ans);
            }
            dp[j] = mini;
        }
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
        int mini = helper(coins, amount);
        if(mini == Integer.MAX_VALUE) return -1;
        return mini;
    }
}