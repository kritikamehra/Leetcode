class Solution {
    public boolean helper(char[][] board, String word, int i, int j, String drxn) {
        if(word.length() == 0)  return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        //mark as visited
        char temp = board[i][j];
        board[i][j] = '.';

        boolean left = false, right = false, bottom = false, top = false;

        if(!drxn.equals("left") && i-1 >= 0 && board[i-1][j] == word.charAt(0)) {
            left = helper(board, word.substring(1), i-1, j, "right");
        }

        if(!drxn.equals("right") && i+1 < board.length && board[i+1][j] == word.charAt(0)) {
            right = helper(board, word.substring(1), i+1, j, "left");
        }

        if(!drxn.equals("top") && j-1 >= 0 && board[i][j-1] == word.charAt(0)) {
            top = helper(board, word.substring(1), i, j-1, "bottom");
        }

        if(!drxn.equals("bottom") && j+1 < board[i].length && board[i][j+1] == word.charAt(0)) {
            bottom = helper(board, word.substring(1), i, j+1, "top");
        }

        board[i][j] = temp;
        return left || right || top || bottom;
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                 if(board[i][j] == word.charAt(0)) {
                    boolean check = helper(board, word.substring(1), i, j, "");
                    if(check)   return true;
                 }
            }
        }

        return false;
    }
}