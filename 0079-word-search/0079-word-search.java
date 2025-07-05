class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(solve(board, visited, word.substring(1), i, j)) return true;
                }
            }
        }
        return false;
    }

    public boolean solve(char[][] board, boolean[][] visited, String word, int row, int col) {
        if(word.length() == 0) return true;
        if(row >= board.length || col >= board[0].length) return false;

        visited[row][col] = true;

        //right
        if(col+1 < board[row].length && board[row][col+1] == word.charAt(0) && visited[row][col+1] == false) {
            if(solve(board,visited,word.substring(1),row,col+1)) return true;
        }
        //down
            if(row+1 < board.length && board[row+1][col] == word.charAt(0) && visited[row+1][col] == false) {
            if(solve(board,visited,word.substring(1),row+1,col)) return true;
        }
        //left
            if(col-1 >= 0 && board[row][col-1] == word.charAt(0) && visited[row][col-1] == false) {
            if(solve(board,visited,word.substring(1),row,col-1)) return true;
        }
        //up
            if(row-1 >= 0 && board[row-1][col] == word.charAt(0) && visited[row-1][col] == false) {
            if(solve(board,visited,word.substring(1),row-1,col)) return true;
        }

        visited[row][col] = false;
        return false;
    }
}