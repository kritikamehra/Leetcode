class Solution {
    public int helper(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];

        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1; // any coin 0 amount 1 way take  nothing
        }
        for(int i = 0; i <= amount; i++) {
            dp[0][i] = 0; // 0 coin any amount 0 ways
        }

        dp[0][0] = 1; // 0 coin 0 amount 1 way

        for(int coin = n-1; coin >= 0; coin--) {
            for(int amt = 1; amt <= amount; amt++) {
                if(coins[coin] > amt) dp[coin][amt] = dp[coin+1][amt]; //coin val > amt
                else { 
                    // pick
                    int pick = dp[coin][amt-coins[coin]];
                    //not pick 
                    int notpick = dp[coin+1][amt];
                    dp[coin][amt] = pick+notpick;
                }
            }
        }
        return dp[0][amount];
    }
    public int change(int amount, int[] coins) {
        return helper(amount, coins);
    }
}