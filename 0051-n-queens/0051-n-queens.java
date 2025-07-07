class Solution {
    public List<String> build(char[][] board) {
        List<String> temp = new ArrayList<>();
        for(int i =0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }
        return temp;
    }
    public boolean canPlace(char[][] board, int n, int row, int col) {
        for(int i = col; i >= 0; i--) {
            if(board[row][i] == 'Q') return false;
        }

        int i = row, j = col;
        i--;
        j--;
        while(i >= 0 && j >= 0) {
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        i = row+1;
        j = col-1;
        while(i < n && j >= 0) {
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(List<List<String>> ans, char[][] board, int n, int col) {
        if(col >= n) {
            ans.add(new ArrayList<>(build(board)));
            return;
        }

        for(int i = 0; i < n; i++) {
            if(canPlace(board, n, i, col)) {
                board[i][col] = 'Q';
                solve(ans, board, n, col+1);
                board[i][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        solve(ans, board, n, 0);
        return ans;
    }
}