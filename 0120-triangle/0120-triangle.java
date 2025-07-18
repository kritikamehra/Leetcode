class Solution {
    public int helper(int m, int n, List<List<Integer>> triangle, int[][] dp) {
        if(m == triangle.size()-1) return triangle.get(m).get(n);
        if(dp[m][n] != -1) return dp[m][n];
        int down = helper(m+1, n, triangle, dp);
        int right = helper(m+1, n+1, triangle, dp);

        return dp[m][n] = triangle.get(m).get(n) + Math.min(down, right);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int dp[][] = new int[m][m];
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0,0,triangle,dp);
    }
}