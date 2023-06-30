package Arrays;

public class MissingNumber {
    static int missingNumber(int array[], int n) {
        
        int sumOfN,sum=0;
        sumOfN = n*(n+1)/2;
        
        for(int ele:array){
            sum = sum+ele;
        }
        return sumOfN-sum;
    }
    public static void main(String[] args) {
        int array[] = {1,2,5,4,6};
        System.out.println("The Array elements are :- ");
        for(int i : array){
            System.out.println(i);
        }
        System.out.println("Missing number in the Array is :-");
        System.out.print(missingNumber(array, 6));
    }
}
