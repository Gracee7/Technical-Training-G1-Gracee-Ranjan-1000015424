//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


public class NumCharPattern {

    // Java code for printing pattern of Numbers
    public static int printcolumn(int index, int column) {
        //Termination case
        if(column==0){
            return index;
        }
        //Recursive call
        int result = printcolumn(index, column-1);
        //Business logic
        result++;
        System.out.print(" "+result);
        return result;
    }

     public static void printrows(int rows,int column,int index) {
        //Termination case
        if(rows==0){
            return;
        }
        //Business logic
        index = printcolumn(index, column);
        System.out.println();
        //Recursive call
        printrows(rows-1,column+1,index);
    }

 // Java code for printing pattern of Characters
// function to print a row
static void print_row(int no, int val)
{
    // base case
    if (no == 0)
        return;
    System.out.print((char)(val + 64) + " ");
 
    // recursively calling print_row()
    print_row(no - 1, val);
}
 
// function to print the pattern
static void pattern(int n, int num)
{
    // base case
    if (n == 0)
        return;
    print_row(num - n + 1, num - n + 1);
    System.out.println();
 
    // recursively calling pattern()
    pattern(n - 1, num);
}
 
// Driver code
public static void main(String[] args)
{
    int n = 5;
    pattern(n, n);
    printrows(4,1,0);
}
}
    
   

