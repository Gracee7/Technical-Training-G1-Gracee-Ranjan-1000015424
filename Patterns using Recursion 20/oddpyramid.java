//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


public class oddpyramid {
static void print_space(int space)
{
    // base case
    if (space == 0)
    return;
    // recursively calling print_space()
    System.out.print(" ");
    print_space(space - 1);
}
// function to print asterisks
static void print_asterisk(int asterisk)
{
    // base case
    if (asterisk == 0)
    return;
    System.out.print(" * ");
    // recursively calling asterisk()
    print_asterisk(asterisk - 1);

}
static void print_oddast(int odd)
{
    if(odd==1)
    return;
    System.out.print(" * ");
    print_oddast(odd-1);
}
// function to print the pattern
static void pattern(int n, int num,int m)
{
    // base case
    if (n == 0)
    return;
    print_space(m+n-1);
    print_asterisk(num-n+ 1);
    print_oddast(num-n+ 1);
    System.out.println("");
    // recursively calling pattern()
    pattern(n - 1, num,m-2);
}
// Driver code
    public static void main(String[] args)
    {
        int n = 5;
        pattern(n, n,9);
    }
}