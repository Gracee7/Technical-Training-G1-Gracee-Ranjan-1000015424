//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


import java.util.*;
public class sumnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the natural number upto which you want sum :- ");
        int number=sc.nextInt();
        int sum = addNumbers(number);
        addNumbers(3,0);
        System.out.println("Sum = " + sum);
        sc.close();
    }

    //Stack Fall Method
    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1); //Recursive Call
        else
            return num; // termination case
    } 

    //Stack Build Method
    public static void addNumbers(int num,int sum)
{
     //Termination
        if(num==0){
            System.out.println(sum);
            return;
        }
        //Business Logic
        sum = sum+num;
        //Recursive call
        addNumbers(num-1,sum);    
}
}
