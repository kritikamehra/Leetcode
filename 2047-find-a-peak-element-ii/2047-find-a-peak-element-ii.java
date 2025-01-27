class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int ans[] = {-1,-1};
        for(int i = 0; i < m*n; i++) {
            int col = i%m;
            int row = i/m;
            
            int ele = mat[row][col];
            boolean c1 = col-1 < 0 || ele > mat[row][col - 1]; //left
            boolean c2 = col+1 >= m || ele > mat[row][col + 1]; 
            boolean c3 = row+1 >= n || ele > mat[row + 1][col];
            boolean c4 = row-1 < 0 || ele > mat[row - 1][col];

            if(c1 && c2 && c3 && c4) {
                ans[0] = row;
                ans[1] = col;
                return ans;
            }
        }
        return ans;
    }
}