package Arrays;

public class WordSearch {

    static boolean isNotPresent(char board[][], int row, int column, String word, int index) {
        return row >= 0 && column >= 0 && row < board.length && column < board[row].length && board[row][column] == word.charAt(index);
    }

    static boolean wordInblock(char board[][], int row, int column, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (isNotPresent(board, row, column, word, index)) {
            // Marking the cell as visited
            char temp = board[row][column];
            board[row][column] = '#';

            // Move to the next row (down)
            if (wordInblock(board, row + 1, column, word, index + 1)) {
                return true;
            }

            // Move to the previous row (up)
            if (wordInblock(board, row - 1, column, word, index + 1)) {
                return true;
            }

            // Move to the next column (right)
            if (wordInblock(board, row, column + 1, word, index + 1)) {
                return true;
            }

            // Move to the previous column (left)
            if (wordInblock(board, row, column - 1, word, index + 1)) {
                return true;
            }

            // Undo the changes
            board[row][column] = temp;
        }

        return false;
    }
    
    public static boolean exist(char[][] board, String word) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (wordInblock(board, i, j, word, 0)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char board[][] = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'},
        };

        String word = "ABCCED";
        System.out.println(exist(board,word));
    }
}



