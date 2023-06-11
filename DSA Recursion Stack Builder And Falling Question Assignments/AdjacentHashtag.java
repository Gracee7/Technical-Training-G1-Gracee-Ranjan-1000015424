//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1

public class AdjacentHashtag {
     //Using stack builder
    public static void rephas(String str, int label) {
        //Termination
        if(str.length()-1==label){
            System.out.println(str);
            return;
        }
        //Business logic
        StringBuilder newstr = new StringBuilder(str);
        if(str.charAt(label)==str.charAt(label+1)){
            newstr.setCharAt(label+1, '#');
        }
        //recursive call
        rephas(newstr.toString(), label+1);
    }

    //using stack Fall return
    public static String rephas(String str) {

        //termination
        if(str.length()==1){
            return ""+str.charAt(0);
        }
        //recursive call 
        String result = rephas(str.substring(1));
        // business logic
        if(result.charAt(0) == str.charAt(0)){

            StringBuilder newstr = new StringBuilder(str);
            newstr.setCharAt(0, '#');
            return (newstr.toString().substring(0,1)+result);
        }
        
        else{
            System.out.println("-->>"+str.substring(0,1)+result);
            return str.substring(0,1)+result;
        }
    }
    public static void main(String[] args) {
        rephas("aabbcc", 0);
        System.out.println(rephas("aabbcc"));
    }
}
