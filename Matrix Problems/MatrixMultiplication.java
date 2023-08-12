import java.util.*;
class MatrixMultiplication {

	static void Multiply(int[][] mat1, int[][] mat2,int r1,int r2,int c1,int c2)
	{
		// To store result
		int[][] rslt = new int[r1][c2];
		System.out.println("Multiplication of given two matrices is:");
		int i, j, k;
		for (i = 0; i < r1; i++) {
			for (j = 0; j < c2; j++) {
				rslt[i][j] = 0;
				for (k = 0; k <r2; k++)
					rslt[i][j] += mat1[i][k] * mat2[k][j];
				System.out.print(rslt[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter no. og rows of matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter the no. of columns of matrix 1");
        int c1 = sc.nextInt();

        int[][] mat1 = new int[r1][c1];
        
        System.out.println("Enter the elements of matrix 1");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }		

        System.out.println("Enter no. of rows of matrix 2");
        int r2 = sc.nextInt();
        System.out.println("Enter no. of columns of matrix 2");
        int c2 = sc.nextInt();

        System.out.println("Enter the elements of matrix 2");
        int[][] mat2 = new int[r2][c2];
        
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
			Multiply(mat1, mat2,r1,r2,c1,c2);

            sc.close();
		}
	}


