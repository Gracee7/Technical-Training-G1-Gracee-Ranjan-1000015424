import java.util.ArrayList;
import java.util.List;

public class LeetCode_54_SpiralMatrix{
    static List<Integer> list;

    public static void rightMove(int[][] matrix, int left, int right){
        if(left>right){
            return;
        }
        for(int i=left;i<=right;i++){
            list.add(matrix[left][i]);
           
        }
    }
    
    public static void bottomMove(int[][] matrix, int top, int bottom,int right){
        if(top>bottom){
            return;
        }
        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
           
        }
    }

    public static void leftMove(int[][] matrix, int left, int right,int bottom){
        if(left>right){
            return;
        }
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
           
        }
    }

    public static void upMove(int[][] matrix, int top, int bottom,int left){
         if(top>bottom){
            return;
        }

        if(top==bottom){
            list.add(matrix[bottom][left]);
           
        }
        else{
            for(int i=bottom;i>=top;i--){
               list.add(matrix[i][left]);
              
            }
        }
        
    }


    public static List<Integer> spiralOrder(int[][] matrix) {
         list = new ArrayList<>();
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;

        while(top<=bottom || left<=right){
            if(top>bottom || left>right){
                break;
            }
            rightMove(matrix, left, right);
            top++;
            
            if(top>bottom || left>right){
                break;
            }
            bottomMove(matrix, top, bottom, right);
            right--;

            if(top>bottom || left>right){
                break;
            }
            leftMove(matrix, left, right, bottom);
            bottom--;
            
            if(top>bottom || left>right){
                break;
            }
            upMove(matrix, top, bottom, left);
            left++;
        }
        

        return list;
    }
    public static void main(String[] args) {
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiralOrder(array));
    }
}
