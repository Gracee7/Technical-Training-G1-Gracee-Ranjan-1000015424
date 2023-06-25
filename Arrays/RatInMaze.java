package Arrays;

public class RatInMaze {
    static boolean isnotBloked(int board[][],int row,int column,int[][] path){
        if(row >= 0 && column >= 0 && row < board.length && column < board[row].length && board[row][column] == 1 && path[row][column] == 0){
            return true;
        }
        return false;
    }

    static boolean ratInMaze(int board[][],int row, int column,int[][] path){
        if(row==board.length-1  && column==board.length-1){
            path[row][column]=1;
            return true;  
        }
        
        if(isnotBloked(board,row,column,path)){
            path[row][column]=1;
            
            // Move to the next row (down)
            if (ratInMaze(board, row + 1, column, path)) {
                return true;
            }

            // Move to the previous row (up)
            if (ratInMaze(board, row - 1, column, path)) {
                return true;
            }

            // Move to the next column (right)
            if (ratInMaze(board, row, column + 1, path)) {
                return true;
            }

            // Move to the previous column (left)
            if (ratInMaze(board, row, column - 1, path)) {
                return true;
            }

            //Undo the changes
            path[row][column]=0;
        }

        return false;

    }
    public static void main(String[] args) {
        int board[][]={
            {1,0,0,1,1},
            {1,1,1,0,1},
            {0,0,1,0,1},
            {0,1,1,0,0},
            {0,1,1,1,1},
        };

        int path[][] = new int[board.length][board.length];
        boolean result = ratInMaze(board, 0, 0, path);
        if(result){

            System.out.println("Rat reached");
            for(int i=0;i<path.length;i++){
                for(int j=0;j<path[i].length;j++){
                    System.out.print(path[i][j]+" ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Rat not reached!!");
        }
    }
}
