//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


import java.util.*;
class occurance0{

    //Stack Fall method
    public static int zeroCount(int num)
    {
        //termination
        if(num == 0)
       return 0;

    // bussiness logic   
    if(num %10 ==0)
        return 1 + zeroCount(num / 10);
    else
        return zeroCount(num/10); //recursive call
    }

    //Stack Build Method
    public static void zeroCount1(int num,int count)
    {
         //Termination
        if(num==0){
            System.out.println(count);
            return;
        }
        //Business logic
        if(num%10 == 0){
            count++;
        }
        //recursive call
        zeroCount1(num/10,count);
         
    }
    public static void main (String[] args) 

    {
        
        Scanner sc = new Scanner(System.in);
    		System.out.println("Enter Number :- ");
    		int number=sc.nextInt();
        System.out.println("Occurence of 0's in the digit are : - "+zeroCount(number));
        zeroCount1(number, 0);
        sc.close();
    }

}
