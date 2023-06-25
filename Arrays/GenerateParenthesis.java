package Arrays;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    private static void generateBrackets(List<String> result, int n, int openCount,int closedcount, StringBuilder output){
        //Termination
        if(output.length()==n*2){
            result.add(output.toString());
            return;
        }
        
        if(openCount<n){
            output.append("(");
            generateBrackets(result,n,(openCount+1),closedcount,output);
            output.deleteCharAt(output.length()-1);
        }
        
        if(closedcount<openCount){
            output.append(")");
            generateBrackets(result,n,openCount,(closedcount+1),output);
            output.deleteCharAt(output.length()-1);
        }

    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        generateBrackets(result,n,0,0,sb);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
