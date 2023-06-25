package Arrays;

public class ValidSuduko {
    final int max =9;
    char board[][];
    private boolean isPresentinrow(int row, int column, char value){
        
        //The value is present in row
        for(int col=0 ; col<max;col++){
            if(col==column){
                continue;
            }
            if(board[row][col]==value){
                return true;
            }
        }
        return false;
    }

    private boolean isPresentincol(int row, int column, char value){
        //The value is present in column
        for(int r =0; r <max;r++){
            if(r==row){
                continue;
            }
            if(board[r][column]==value){
                return true;
            }
        }
        return false;
    }

    private boolean isPresentingrid(int row, int column, char value){
        //The value is present in grid
        int startrow = row - row%3;
        int startcolumn = column - column%3;

        for(int i=startrow;i<startrow+3;i++){
            for(int j=startcolumn;j<startcolumn+3;j++){
                if(i==row && j==column){
                    continue;
                }
                if(board[i][j]==value){
                    return true;
                }
            }
        } 
        return false;
    }

    private boolean isCorrectToPlace(int row, int column, char value){
        return !isPresentinrow(row,column,value) && !isPresentincol(row,column,value) && !isPresentingrid(row,column,value);         
    }

    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isCorrectToPlace(i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
