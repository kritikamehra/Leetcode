class Solution {
    public int findIndex(int[][] mat, int n, int m, int col) {
        int maxele = Integer.MIN_VALUE, maxIndex = -1;
        for(int i = 0; i < n; i++) {
            if(maxele < mat[i][col]) {
                maxele = mat[i][col];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        // int ans[] = {-1,-1};
        int low = 0, high = m - 1;
        while(low <= high) {
            int mid = low+(high-low)/2;
            int maxEleIndex =  findIndex(mat, n, m, mid); // will return row number
            // the above method finds max ele in a column therefore the top and bottom will be already checked and will be smaller than the max ele
            // check left and right
            int right = mid+1 < m ? mat[maxEleIndex][mid+1] : -1;
            int left = mid-1 >= 0 ? mat[maxEleIndex][mid-1] : -1;
            if(mat[maxEleIndex][mid] > left && mat[maxEleIndex][mid] > right) return new int[]{maxEleIndex, mid};
            else if(mat[maxEleIndex][mid] < left)   high = mid-1;
            else    low = mid+1;
        }
        return new int[]{-1,-1};
    }
}