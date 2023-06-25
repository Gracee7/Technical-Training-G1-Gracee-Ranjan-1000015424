package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> combination(int[] nums,int index) {
        
        if(index==nums.length){
            List<List<Integer>> li = new ArrayList<>();
            return li;
        }

        List<List<Integer>> result = combination(nums,index+1);
        
        if(result.size()==0){
            List<Integer> singleval = new ArrayList<>();
            singleval.add(nums[index]);
            result.add(singleval);
            return result;
        }
        else{            
            List<List<Integer>> finalresult = new ArrayList<>();

            for(List<Integer> li:result){
                for(int i=0;i<=li.size();i++){
                    List<Integer> list = new ArrayList<>(li);

                    list.add(i,nums[index]);

                    finalresult.add(list);
                }
            }
               
        return finalresult;
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        return combination(nums, 0);
    }

    public static void main(String[] args) {
        int array[] = {1,2,3};
        System.out.println(permute(array));
    }
}
