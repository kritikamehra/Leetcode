class Solution {
    public int helper(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int prev[] = new int[n];
        prev[0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for(int i = 0; i < m; i++) { 
            int[] temp = new int[n];
            for(int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) temp[j] = 0;
                else {
                    if(j == 0) {
                        temp[j] = prev[j];
                    }
                    else {
                    temp[j] = prev[j] + temp[j-1];
                    }
                }
            }
            prev = temp;
        }
        return prev[n-1];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return helper(obstacleGrid);
    }
}