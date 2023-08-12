package multithreading;

import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
       
        //making an input buffer 
        Scanner in = new Scanner(System.in);
        
        //defining variables
        String user_name = "Gracee Ranjan";
        int pin = 5749;
        long bank_bal = 100000;

       System.out.println("*********Welcome to ATM*********");
       System.out.println("\nPlease enter your pin= ");
       int tmp = in.nextInt();
       if (tmp == pin){
            System.out.println("\nWelcome, "+user_name);
            //System.out.println("Your current bank balance is "+bank_bal);
            while(true){
                System.out.println("\nChoose from the options below: ");
                System.out.println("1. Withdraw amount from savings.");
                System.out.println("2. Deposit amount to savings.");
                System.out.println("3. Check current balance.");
                System.out.println("4. Exit");
                System.out.println("Enter choice: ");
                int ch = in.nextInt();
                
                if(ch == 1){
                    System.out.println("Enter amount you want to withdraw: ");
                    long amount = in.nextLong();
                    if(bank_bal <= 0){
                        System.out.println("You have no bank balance to withdraw!!");
                        continue;
                    }
                    
                    System.out.println("Please Enter your pin= ");
                    int tmp1 = in.nextInt();
                    if (tmp1 == pin){
                        bank_bal -= amount;
                        System.out.println("Operation sucessfull! ");
                        System.out.println("Your current bank balance is "+bank_bal);
                        
                    }
                    else{
                        System.out.println("Transaction failed, wrong pin!!");
                                               
                    }
                }
                else if(ch==2){
                    System.out.println("Enter amount you want to deposit: ");
                    long amount = in.nextLong();
                    System.out.println("Please Enter your pin= ");
                    int tmp1 = in.nextInt();
                    if (tmp1 == pin){
                        bank_bal += amount;
                        System.out.println("Operation sucessfull! ");
                        System.out.println("Your current bank balance is "+bank_bal);
                    }
                    else{
                        System.out.println("Transaction failed, wrong pin!!");
                    }
                }
                else if(ch==3){
                    System.out.println("Please Enter your pin= ");
                    int tmp1 = in.nextInt();
                    if (tmp1 == pin){
                        System.out.println("Your current bank balance is "+bank_bal);
                    }
                    else{
                        System.out.println("Transaction failed, wrong pin!!");
                    }                   
                }
                else{
                    System.out.println("Thankyou, visit again!!");
                    break;
                }
            }
            
        }
    in.close();
       
    }
}
