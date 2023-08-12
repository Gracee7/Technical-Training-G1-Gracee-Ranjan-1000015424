

public class StringPalindrome {
    static boolean CheckPalinStr(String str1){

        boolean ans = false;
        String rev ="";

        for (int i = str1.length() - 1; i >= 0; i--){
            rev = rev + str1.charAt(i);
        }

        if(str1.equals(rev)){
            ans = true;
        }

        return ans;


    }
   public static void main(String[] args){

    String str = "abba";
    boolean A = CheckPalinStr(str);
    System.out.println(A);
   } 
}
