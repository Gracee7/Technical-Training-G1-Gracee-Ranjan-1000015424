
public class MCP_Problem {
        public static int minimumCostPath(int[][] grid)
        {
            int rows = grid.length;
            int cols = grid[0].length;
    
            int[][] resultMatrix = new int[rows][cols];
            resultMatrix[0][0] = grid[0][0];
    
            for (int i = 1; i < rows; i++) {
                resultMatrix[i][0] = resultMatrix[i - 1][0] + grid[i][0];
            }
    
            for (int j = 1; j < cols; j++) {
                resultMatrix[0][j] = resultMatrix[0][j - 1] + grid[0][j];
            }
    
            for (int i = 1; i < rows; i++) {
                for (int j = 1; j < cols; j++) {
                    resultMatrix[i][j] = Math.min(Math.min(resultMatrix[i - 1][j - 1], resultMatrix[i - 1][j]), resultMatrix[i][j - 1]) + grid[i][j];
                }
            }
    
            return resultMatrix[rows - 1][cols - 1];
            
        }
    
        public static void main(String[] args) {
            int costMatrix[][] = {{2,0,6},{3,1,7},{4,5,9}};
            System.out.println(minimumCostPath(costMatrix));
        }
    }

