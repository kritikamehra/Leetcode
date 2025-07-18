class Solution {
    public int helper(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] prev = new int[n];
            for(int j = 0; j < m; j++) {
                prev[j] = matrix[0][j];
            }

        for(int  i = 1; i < m; i++) {
            int[] temp = new int[n];
            for(int j = 0; j < m; j++) {
                int up = prev[j];
                int left = Integer.MAX_VALUE;
                if(j > 0) left = prev[j-1];
                int right =Integer.MAX_VALUE;
                if(j < m-1) right = prev[j+1];

                temp[j] = matrix[i][j] + Math.min(up, Math.min(left, right));
            }
            prev = temp;
        }
        
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, prev[j]);
        }
        return min;
    }
    public int minFallingPathSum(int[][] matrix) {
        return helper(matrix);
    }
}