class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startrow = 0, endrow = matrix.length-1, startcol = 0, endcol = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();
        while(startrow <= endrow && startcol <= endcol) {
            for(int j = startcol; j <= endcol; j++)
                ans.add(matrix[startrow][j]);
            
            startrow++;

            for(int i = startrow; i <= endrow; i++) 
                ans.add(matrix[i][endcol]);

            endcol--;

            if(startrow <= endrow)
                for(int j = endcol; j >= startcol; j--)
                    ans.add(matrix[endrow][j]);
            
            endrow--;

            if(startcol <= endcol)
                for(int i = endrow; i >= startrow; i--) 
                    ans.add(matrix[i][startcol]);
            
            startcol++;
        }
        return ans;
    }
}