
import java.util.*;

class MatrixAddition {

	// Function to print Matrix
	static void printMatrix(int M[][],int rowSize,int colSize)
	{
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	static int[][] add(int A[][], int B[][],int r1,int c1)
	{
		int i, j;
		int C[][] = new int[r1][c1];

		for (i = 0; i < r1; i++)
			for (j = 0; j < c1; j++)
				C[i][j] = A[i][j] + B[i][j];

		return C;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
       
        System.out.println("(* For Addition both matrix size should be same )");
        System.out.println("Enter the no of rows of matrix");
        int r1 = sc.nextInt();
		System.out.println("Enter no. of columns of matrix");
        int c1 = sc.nextInt();
        
        int[][] mat1 = new int[r1][c1];
        int[][] mat2 = new int[r1][c1];
        System.out.println("Enter the elements of matrix 1");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }		

        System.out.println("Enter the elements of matrix 2");       
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        
		 // Print the matrice 1 
         System.out.println("\nMatrix A:");
         printMatrix(mat1, r1, c1);

          // Print the matrice 2
        System.out.println("\nMatrix A:");
        printMatrix(mat2, r1, c1);

		// Add the two matrices
		int C[][] = add(mat1, mat2, r1,c1);

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, r1,c1);

        sc.close();
	}
}

