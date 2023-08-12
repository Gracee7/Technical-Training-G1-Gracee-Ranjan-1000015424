public class RunningLengthEncoding {
    
    public static void encoding(String str){
        int n = str.length();
        for(int i = 0;i < n;i++){

            // Count Occurences pf current charater
            int count = 1;
            while (i < n-1 && str.charAt(i) == str.charAt(i + 1) ){
                count++;
                i++;
            }

            // Print charater and its count
            System.out.print(str.charAt(i) + "" + count);
        }
    
    }
    public static void main(String[] args){
        String str = "wwwwaaadddefxxxhhhhwwo";
        encoding(str);
    }
    
}
