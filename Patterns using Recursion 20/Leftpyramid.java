//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


public class Leftpyramid {
   
// function to print a row
static void printn(int num)
{
    // base case
    if (num == 0)
        return;
    System.out.print ("* ");
 
    // recursively calling printn()
    printn(num - 1);
}
 
// function to print the pattern
static void pattern(int n, int i)
{
    // base case
    if (n == 0)
        return;
    printn(i);
    System.out.println();
 
    // recursively calling pattern()
    pattern(n - 1, i + 1);
}
 
// Driver code
public static void main (String[] args)
{
 
    int n = 5;
    pattern(n, 1);
}
} 
