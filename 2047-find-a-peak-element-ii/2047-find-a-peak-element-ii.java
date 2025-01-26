class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int ans[] = new int[2];
        int s = -1, e = -1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                boolean c1 = j == 0 || mat[i][j] > mat[i][j-1];
                boolean c2 = j == m-1 ||mat[i][j] > mat[i][j+1];
                boolean c3 = i == 0 || mat[i][j] > mat[i-1][j];
                boolean c4 = i == n-1 || mat[i][j] > mat[i+1][j];

                if(c1 && c2 && c3 && c4) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}