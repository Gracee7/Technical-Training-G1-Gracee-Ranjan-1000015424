public class NivePatternMatching {

    static int naivePatternMatching(String text,String pattern){
        int n = text.length();
        int m = pattern.length();

        for(int i =0; i<n-m; i++){
            int j=0;
            while(text.charAt(i+j)==pattern.charAt(j)){
                j++;
            }
            if(j==m){
                System.out.println("FOUND AT INDEX");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String text = "abccbac";
        String pattern = "ccba";
        int res = naivePatternMatching(text, pattern);
        System.out.println(res);
        /*if(res!= -1){
            System.out.println("FOUND");
        }
        else{
            System.out.println("NOT FOUND");
        }
     */   
    }
    
}
