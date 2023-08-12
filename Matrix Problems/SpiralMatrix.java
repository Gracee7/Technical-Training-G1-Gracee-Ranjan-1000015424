import java.util.*;


public class SpiralMatrix {

    public int[][] spiralOrder(int[][] matrix){

        
       return matrix;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //List<Integer> matrix = new ArrayList<Integer>();
        
        System.out.println("Enter the number of rows of List : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number od columns of List : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the List Elements : ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
            matrix[i][j] = sc.nextInt();
            
      }
    }

    SpiralMatrix sp = new SpiralMatrix();
    System.out.println("Matrix in Sprical sequence is : "+sp.spiralOrder(matrix));
    sc.close();
    }
}
