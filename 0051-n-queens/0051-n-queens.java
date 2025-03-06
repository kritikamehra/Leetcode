class Solution {
    public List<String> construct(char[][] board) {
        List<String> temp = new ArrayList<>();
        for(int i = 0; i < board.length; i++) {
            String res = new String(board[i]);
            temp.add(res);
        }
        return temp;
    }
    public boolean canplace(char[][] board, int n, int row, int col){
        for(int i = col; i >= 0; i--) {
            if(board[row][i] == 'Q')   
                return false;
        }

        //upper diagnol
        int i = row, j = col;
        while(i >= 0 && j >= 0) {
            if(board[i][j] == 'Q')  return false;
            i--;
            j--;
        }

        //down diagnal
        i = row; j = col;
        while(i < n && j >= 0) {
            if(board[i][j] == 'Q')  return false;
            i++;
            j--;
        }
        return true;
    }
    public void helper(char[][] board, List<List<String>> ans, int n, int col) {
        if(col >= n) {
            ans.add(construct(board));
            return;
        }

        for(int i = 0; i < n; i++) {
            boolean check = canplace(board, n, i, col);
            if(check) {
                board[i][col] = 'Q';
                helper(board, ans, n, col+1);
                board[i][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        List<List<String>> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, ans, n, 0);
        return ans;
    }
}