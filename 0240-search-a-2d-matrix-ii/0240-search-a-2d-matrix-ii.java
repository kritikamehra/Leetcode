class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m-1;
        while(i < n && i >= 0 && j < m && j >= 0) {
            if(target == matrix[i][j])  return true;
            else if(matrix[i][j] < target)  i++;
            else j--;
        }
        return false;
    }
}