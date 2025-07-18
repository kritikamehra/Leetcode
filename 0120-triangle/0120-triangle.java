class Solution {
    public int helper(List<List<Integer>> triangle) {
        int m = triangle.size();
        int dp[][] = new int[m][m];

        for(int i = m-1; i >= 0; i--) {
            dp[m-1][i] = triangle.get(m-1).get(i);
        }
        
        for(int i = m-2; i >= 0; i--) {
            for(int j = i; j >= 0; j--) {
                int down = dp[i+1][j];
                int right = dp[i+1][j+1];
                dp[i][j] = triangle.get(i).get(j) + Math.min(down, right);
            }
        }


        return dp[0][0];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        return helper(triangle);
    }
}