class Solution {
    public int helper(int amount, int[] coins, int index, int[][] dp) {
        if(index >= coins.length) return 0;
        if(amount == 0) return 1;
        if(amount < 0) return 0;
        if(dp[index][amount] != -1) return dp[index][amount];
        int sum = 0;
        for(int i = index; i < coins.length; i++) {
            sum += helper(amount-coins[i], coins, i, dp);
        }

        return dp[index][amount] = sum;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int i = 0; i < coins.length; i++) {
            Arrays.fill(dp[i],-1);
        }
        return helper(amount, coins, 0, dp);
    }
}