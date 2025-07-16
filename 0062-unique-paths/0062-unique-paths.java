class Solution {
    public int helper(int m, int n, int[][] dp) {
        if(m == 0 && n == 0) return 1;

        if(m < 0 || n < 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];

        //left
        int left = helper(m, n-1, dp);
        //up
        int up = helper(m-1, n, dp);

        return dp[m][n] = left+up;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(m-1, n-1, dp);
    }
}