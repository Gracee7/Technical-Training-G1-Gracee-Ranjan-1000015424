//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


import java.util.*;

public class prime {

  // Using Stack Fall Method
  public static int checkPrime(int num, int i) {
    if (i != 1) {
      if (num % i != 0)
        return checkPrime(num, i - 1);
      return 0;
    }
    return 1;
  }

  // Using Stack Builder Method
        public static void checkprime1(int num, int tmp) {
        //Termination cond
        if(tmp==(int)Math.sqrt(num)){
            System.out.println("The number is prime");
            return;
        }
        //Business logic + recurssion
        if(num%tmp!=0){
            checkprime1(num, tmp);
        }else{
            System.out.println("The number is not prime");
        }        
    }
  

  public static void main(String[] args) {
    Scanner X = new Scanner(System.in);

    int num = 0;
    int res = 0;

    System.out.printf("Enter number: ");
    num = X.nextInt();

    res = checkPrime(num, num / 2); // Return Using Stack Fall
    checkprime1(num, num/2);        // Return Using Stalk Build
    if (res == 1)
      System.out.printf("Number is prime.");
    else
      System.out.printf("Number is not prime.");

    X.close();  
    }
}