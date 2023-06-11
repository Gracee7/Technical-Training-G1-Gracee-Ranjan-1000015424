//Name :- Gracee Ranjan
//Sap I'D :- 1000015424
//Technical Training G1

public class AdjacentStar {
    //Using stack builder
    public static void repstar(String str, int label) {
        //Termination
        if(str.length()-1==label){
            System.out.println(str);
            return;
        }
        //Business logic
        StringBuilder newstr = new StringBuilder(str);
        if(str.charAt(label)==str.charAt(label+1)){
            newstr.insert(label+1, '*');
        }
        //recursive call
        repstar(newstr.toString(), label+1);
    }

    //using stack Fall return
    public static String repstar(String str) {

        //termination
        if(str.length()==1){
            return ""+str.charAt(0);
        }
        //recursive call
        String result = repstar(str.substring(0,str.length()-1));
        


        //business logic
        if(result.charAt(result.length()-1) == str.charAt(str.length()-1)){

            StringBuilder newstr = new StringBuilder(result);
            newstr.append('*');
            newstr.append(str.charAt(str.length()-1));
            
            return (newstr.toString());
        }
        
        else{
            StringBuilder newstr = new StringBuilder(result);
            newstr.append(str.charAt(str.length()-1));
            
            return (newstr.toString());
        }
    }
    public static void main(String[] args) {
        repstar("aabbcc", 0);
        System.out.println(repstar("aabbcc"));
    }
}
