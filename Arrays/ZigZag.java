import java.util.*;

public class ZigZag 
{  
//function to convert array in zigzag form  
public static void zigZag(int arr[])  
{  
boolean flag = true;  
int temp =0;  
//loop iterate over the array  
for (int i=0; i<=arr.length-2; i++)  
{  
if (flag)  
{  
//execute if elements are in the order a > b > c  
if (arr[i] > arr[i+1])  
{  
//swapping logic  
temp = arr[i];  
arr[i] = arr[i+1];  
arr[i+1] = temp;  
}  
}  
else  
{  
//execute if elements are in the order a < b < c  
if (arr[i] < arr[i+1])  
{  
//swapping logic  
temp = arr[i];  
arr[i] = arr[i+1];  
arr[i+1] = temp;  
}  
}  
if(flag==true)  
flag=false;  
else  
flag=true;  
}  
}  
    public static void main(String args[])  
    {  

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array :- ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter the Elements ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        
        zigZag(array);  
        //prints the zigzag array  
        System.out.println("Array in ZigZag is as follows :- \n");
        System.out.println(Arrays.toString(array));  
    }  
}  