package Arrays;

import java.util.*;

class ThirdLargest {

    public static int FindThirdLargest(int[] a,int size )
    {
        int temp;  

        for (int i = 0; i < size; i++)   
        {  
            for (int j = i + 1; j < size; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  

       return a[size-3];  
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of array :- ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the Elements Of Array :-- ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        System.out.println("Elements of Array are :- ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+"\t");
        }
        
        System.out.println("\n");
        System.out.println("The Third Largest Element in Array is  :- "+ FindThirdLargest(array,size ));

        sc.close();
    }
    
}
