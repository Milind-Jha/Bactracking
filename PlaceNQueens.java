public class PlaceNQueens {
    public static void placeNQueens(int n){
        int [][] board = new int[n][n];
        placeQueen( board,0);
    }

    private static void placeQueen(int [][] board,int row) {
        if(board.length==row){
            for(int i=0;i< board.length;i++){
                for(int j=0;j<board[i].length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            return;
        }
        for(int cols = 0;cols < board.length;cols++)
        {
            if(isSafe(board,row,cols))
            {
                board[row][cols] = 1;
                placeQueen(board,row+1);
                board[row][cols] = 0;
            }
        }



    }
    public static boolean isSafe(int board[][], int rows, int cols) {
        // for checking the safety of the queen
        // we will consider 3 parameters {left diagonal, right diagonal and vertically
        // upward}

        // vertically upward
        for (int i = rows - 1, j = cols; i >= 0; i--) {
            if (board[i][j] == 1)
                return false;
        }
        // left diagonal
        for (int i = rows - 1, j = cols - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // right diagonal
        for (int i = rows - 1, j = cols + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }
    public static void main(String [] args){
        int n =4;
        placeNQueens(n);
    }
}
