import java.util.Scanner;

public class ReservationSeat {
    
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        
        String[] columns = { "Col 1",  "Col 2",  "Col 3",  "Col 4" };
        for(int i = 0; i < columns.length; i++){
            System.out.print("\t" + columns[i]);

        }
        String[] Rows = { "Row 1 ", "Row 2 ", "Row 3 ", "Row 4 ", "Row 5 ", "Row 6 ", "Row 7 ", "Row 8 ", "Row 9 ", "Row 10 "};
        String [][] table = {
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},   
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"}

        };
        System.out.println();   
        
        for(int row = 0; row < table.length; row++){
            System.out.print(Rows[row]);
            for(int col = 0; col < table[row].length; col++){
                
                System.out.print("\t" + table[row][col]);

            }

            System.out.println();
        }
        
        System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
        int row1 = reader.nextInt();
        int col1 = reader.nextInt();
        table[row1][col1] = reader.next();
        int[][] test1 = new int[row1][col1];
        
        for (int row = 0; row < table.length; row++) {
            System.out.print(Rows[row]);
            
            for(int col = 1; col < test1[row].length; col++) {
                System.out.print("\t" + test1[row1][col1]);
            }
        }
    }
}