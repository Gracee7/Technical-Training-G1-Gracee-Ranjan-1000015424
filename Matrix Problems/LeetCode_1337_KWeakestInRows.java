import java.util.ArrayList;
import java.util.Arrays;


public class LeetCode_1337_KWeakestInRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] array = new int[mat.length];
        

        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[0].length;j++){
                sum = sum+mat[i][j];
            }
            mat[i][0] = sum;
            array[i] = sum;                     
        }

        Arrays.sort(array);
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<array.length;i++){
            for(int j=0;j<mat.length;j++){
                if(array[i]==mat[j][0]){
                    if(!list.contains(j)){
                        list.add(j);
                        
                    }
                    else{
                        continue;
                    }
                }
            }    
        }
        
        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        
        return array;
    }
    public static void main(String[] args) {
        int array[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        int[] result = kWeakestRows(array,k);
        for(int i=0;i<k;i++){
            System.out.print(" "+result[i]);
        }
    }
}
