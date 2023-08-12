package Arrays;

import java.util.*;

public class MajorityNumber {
    
    public void majorityElement(int[] nums){

        int maxcount =0;
        int index = -1;

      for(int i=0; i<nums.length; i++){
        int count=0;
        for(int j=0 ;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
            if(count > maxcount){
                maxcount = count;
                index = i;
            }
        }
    }
        if(maxcount>nums.length/2){
        System.out.println("The Majority Number is :- "+nums[index]);}
        else{
        System.out.println("NO majority element exists ");}
          
    
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array - ");
        int size = sc.nextInt();
        System.out.println("Enter Elements of The Array :- ");

        int[] elements = new int[size];

        for(int i=0; i<size; i++){
            elements[i] = sc.nextInt();
        }

        MajorityNumber obj = new MajorityNumber();
        obj.majorityElement(elements);

        sc.close();
        
    }
    
}
