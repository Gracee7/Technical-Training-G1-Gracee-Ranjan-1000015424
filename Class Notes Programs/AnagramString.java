
import java.util.Arrays;

public class AnagramString {
    
    static boolean checkAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        char []a = str1.toCharArray();
        Arrays.sort(a);
        str1 = new String(a);

        char []b = str1.toCharArray();
        Arrays.sort(b);
        str2 = new String(b);

        return str1.equals(str2);
        
    }
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "Silent";
        System.out.println(checkAnagram(s1, s2));
    }
}
