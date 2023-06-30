package Arrays;

import java.util.Scanner;


public class RotateArray {

    public static void rotate(int[] nums, int k) {
   if (k==0) return;
   
   if (nums == null || nums.length == 0) return;
   
   for (int i=0; i<k; i++) {
      int j=nums.length-1;
      int temp = nums[j];
      for (; j>0; j--) {
         nums[j] = nums[j-1];
      }
      nums[0] = temp;
   }
   
}

public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter the Size of the Array :- ");
        int size = sc.nextInt();

        System.out.println("Enter Value of K for rotation time : ");
        int k = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the Elements ");
        for(int i=0;i<size;i++){
        array[i] = sc.nextInt();
        }  

        rotate(array,k);
        
        System.out.println("Rotated Array is as Follows :-  ");
        for(int i=0;i<size;i++){
        System.out.println(array[i]);
        } 
        
             
}

}
