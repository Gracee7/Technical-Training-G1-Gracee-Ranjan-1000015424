package Arrays;

import java.util.*;

public class NthLargest {

    public static int FindNthLargest(int[] array,int size,int Nth){
        int temp;  
        for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j <size; j++)   
            {  
                if (array[i] > array[j])   
                {  
                    temp = array[i];  
                    array[i] = array[j];  
                    array[j] = temp;  
                }  
            }  
        }  
       return (array[size-Nth]);  
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array :- ");
        int size = sc.nextInt();

        System.out.println("Enter the Nth Largest you want to find in array - ");
        int Nth = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the Elements ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("\n");
        System.out.println("The Nth Largest Element in array is :- "+FindNthLargest(array,size,Nth));
        sc.close();
    }
    
}
