//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


public class fullpyramid {

    // Making upper part of pyramid 
     static void print_space(int space)
{
    // base case
    if (space == 0)
        return;
    System.out.print(" ");
 
    // recursively calling print_space()
    
    print_space(space - 1);
}
 
// function to print asterisks
static void print_asterisk(int asterisk)
{
    // base case
    if (asterisk == 0)
        return;
    System.out.print("* ");
 
    // recursively calling asterisk()
    print_asterisk(asterisk - 1);
}
 
// function to print the lower part of pyramid
static void UpperPart(int n, int num)
{
    // base case
    if (n == 0)
        return;
    print_space(n - 1);
    print_asterisk(num - n + 1);
    System.out.println("");
 
    // recursively calling pattern()
    UpperPart(n - 1, num);
}
 
 static void LowerPart(int n)
    {
        
        int space = n - 1;
      
       
        // Repeat again in
        // reverse order
        space = 0;
      
        // run loop (parent loop) 
        // till number of rows
        for (int i = n; i > 0; i--)
        {
            // loop for initially space, 
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");
      
            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");
      
            System.out.print("\n");
            space++;
        }
    }
      
    // Driver Code
    public static void main(String[] args) 
    {
        int n = 5;
        UpperPart(n, n); // calling function to print upper part of the pyramid
        LowerPart(n); // calling function to print lower part of the pyramid
          
    }
}

