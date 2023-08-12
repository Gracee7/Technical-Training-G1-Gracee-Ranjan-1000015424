package Arrays;

import java.util.*;

public class SingleNumber {

    public void FindSingle(int[] nums){
        Scanner sc = new Scanner(System.in);
       int index = -1;
        for(int i=0; i<nums.length; i++){
            int count =0; 

            for(int j=0; j<nums.length;j++){
                if(nums[i]==nums[j]){
                count ++;

            }
            
            }

            if(count ==1){
                index =i;
            System.out.println("The Single numbers present in array is at index : "+index+" : Number = "+nums[i]);
            }
          }
          sc.close();
        }
     
      public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Size of Array : ");
        int size= sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the Array Elements : ");
        for(int i=0; i<size; i++){
            nums[i] = sc.nextInt();
        }

        SingleNumber SN = new SingleNumber();
       
        SN.FindSingle(nums);

        sc.close();
    }
}
