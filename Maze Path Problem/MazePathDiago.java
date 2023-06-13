//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training Group G1

public class MazePathDiago {
    public static void mazePathProblem(int row, int col, int endRow, int endCol, String result) {
        if (row == endRow && col == endCol) {
            System.out.println(result);
            return;
        }

        if (row < endRow) {
            mazePathProblem(row + 1, col, endRow, endCol, result + "D"); //Recursive call by moving Down
        }

        if (col < endCol) {
            mazePathProblem(row, col + 1, endRow, endCol, result + "R"); //Recursive Call by moving Right
        }

        if (row < endRow && col < endCol) {
            mazePathProblem(row + 1, col + 1, endRow, endCol, result + "X"); //Recursive Call by moving Diagonally
        }
    }

    public static void main(String[] args) {
           
    mazePathProblem(0, 0, 2, 2, "");
   
    }

}