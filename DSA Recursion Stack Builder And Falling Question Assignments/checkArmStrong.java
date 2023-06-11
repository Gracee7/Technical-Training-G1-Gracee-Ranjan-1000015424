//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1
    
    import java.util.*;
    public class checkArmStrong
{
     public static void isArmstrong(int num,int sum,int global){        
        //Termination step
        if(num==0){
            if(sum==global){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not an Armstrong");
            }
            return;
        }
        sum = (int)(sum+Math.pow(num%10,3)); //Business Logic
        
        isArmstrong(num/10, sum, global); //Recursive call     
    
    }
    //using Stack Falling return
    public static int isArmstrong(int num) {
        //Termination
        if(num==0){
            return 0;
        }
        //recursive call
        int result = isArmstrong(num/10);
        //Business logic
        result =  (int)(result+Math.pow(num%10,3));
        return result;
    }
       public static void main(String[] args)
       {
            Scanner sc = new Scanner(System.in);
           checkArmStrong ob = new checkArmStrong();
           System.out.println("Enter the number to check if it's Armstrong number : - ");
           int x = sc.nextInt();
           isArmstrong(x, 0, x); // Stack Builder return
           if(x==isArmstrong(x))
           System.out.println("The number is an ArmStrong Number by Falling return");
           else
           System.out.println("THe number is not a Armstrong number by Falling return");
           
           sc.close();
       }
}