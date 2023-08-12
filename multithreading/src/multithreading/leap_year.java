package multithreading;

import java.util.Scanner; 
public class leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);   
        int year;    
        System.out.println("Enter year want to check: ");
        year = in.nextInt();   
        
        if(year % 4 == 0){  
            System.out.println("The year is leap year!");
           
        }
        else{
            System.out.println("Not a leap year!");
        }
        in.close();  
    }
}

