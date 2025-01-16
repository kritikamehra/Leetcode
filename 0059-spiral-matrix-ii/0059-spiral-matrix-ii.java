class Solution {
    public int[][] generateMatrix(int n) {

        int count = 1;
        int[][] mat = new int[n][n];
        int top = 0, bottom = n-1, left = 0, right = n-1;

        while(top <= bottom && left <= right) {

            for(int i = left; i <= right; i++) {
                mat[top][i] = count++;
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                mat[i][right] = count++;
            }
            right--;

            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    mat[bottom][i] = count++;
                }
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    mat[i][left] = count++;
                }
                left++;
            }
        }

        return mat;
    }
}