class Solution {
    public int helper(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
            for(int j = 0; j < m; j++) {
                dp[0][j] = matrix[0][j];
            }

        for(int  i = 1; i < m; i++) {
            for(int j = 0; j < m; j++) {
                int up = dp[i-1][j];
                int left = Integer.MAX_VALUE;
                if(j > 0) left = dp[i-1][j-1];
                int right =Integer.MAX_VALUE;
                if(j < m-1) right = dp[i-1][j+1];

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(left, right));
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[m - 1][j]);
        }
        return min;
    }
    public int minFallingPathSum(int[][] matrix) {
        return helper(matrix);
    }
}