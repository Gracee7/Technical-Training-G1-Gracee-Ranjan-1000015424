//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1


import java.lang.Math;
public class palindrome {
    
// recursive function that
// returns the reverse of digits

//Using Stack Fall Method
public static String checkpalindrome(String str) {
        int length = str.length();
        //Termination
        if (length <= 1) {
            return "The String is palindrome";
        }
       
        if (str.charAt(0) == str.charAt(length - 1)) {
            return checkpalindrome(str.substring(1, length - 1)); //recursive call
        } else {
            return "The String is not a palindrome";
        }
    }

//Using Stack Builder Method
 public static void checkpalindrome(String str,int index) {
        //Termination case
        if(index == Math.round(str.length()/2)){
            System.out.println("The string is plaindrome");
            return;
        }
        
        if(str.charAt(index) == str.charAt(str.length()-1-index)){
            checkpalindrome(str, index+1); //recursive call
        }else{
            System.out.println("String is not a plaindrome");
            return;
        }    
    }
 
// Driver Code
public static void main (String[] args)
{
    checkpalindrome("ajioija",0);
    System.out.println(checkpalindrome("Gracee")); 
}
}

