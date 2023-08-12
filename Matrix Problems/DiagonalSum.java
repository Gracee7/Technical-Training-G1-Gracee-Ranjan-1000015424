import java.util.*;

public class DiagonalSum {

	static void diagonalSum(int [][]matrix,int row,int column)
	{
		int principal = 0, secondary = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <column; j++) {
	
				// Condition for principal
				// diagonal
				if (i == j)
					principal += matrix[i][j];
	
				// Condition for secondary
				// diagonal
				if ((i + j) == (row - 1))
					secondary += matrix[i][j];
			}
		}
	 
        int diagonal_sum = principal+secondary;
		System.out.println("Sum of Diagonals = "+ diagonal_sum);
									
		
	}

	// Driver code
	static public void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter the o. of rows of the matrix ");
        int row = sc.nextInt();
        System.out.println("Enter the no. of columns of the matrix ");
        int column = sc.nextInt();
		int [][] matrix = new int[row][column];
        System.out.println("Enter the elements of the matrix :");
        for(int i=0; i<row; i++){
            for(int j=0; j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
	diagonalSum(matrix,row,column);

    sc.close();
	}

}



