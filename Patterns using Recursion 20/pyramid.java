//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


public class pyramid {
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
 
// function to print the pattern
static void pattern(int n, int num)
{
    // base case
    if (n == 0)
        return;
    print_space(n - 1);
    print_asterisk(num - n + 1);
    System.out.println("");
 
    // recursively calling pattern()
    pattern(n - 1, num);
}
 
// Driver code
public static void main(String[] args)
{
    int n = 5;
    pattern(n, n);
}
    
}
