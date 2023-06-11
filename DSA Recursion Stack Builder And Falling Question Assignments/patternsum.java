//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


import java.util.*;
import java.lang.Math;
public class patternsum {

    //Stack Fall Method
    public static int sum(int n)
    {   
        if (n == 1)
        return 1;

        else        
        return ((int)Math.pow(n,n)+sum(n - 1)); 
    }

    //Stack Builder Method
    //Termination
    public static void sum(int num,double sum)
    {
        if(num==0){
            System.out.println(sum);
            return;
        }

        //Business logic
        sum = sum + (num/(Math.pow(num,num)));
     
        //recursive call
        sum(num-1,sum);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for the pattern 1/1^1+2/2^2+3/3^3+.......+n/n^n :- ");
        int n=sc.nextInt();

        System.out.println("The Sum of Pattern is  : - "+sum(n));
        sum(n,0.0);
        sc.close();
    }
    
}
