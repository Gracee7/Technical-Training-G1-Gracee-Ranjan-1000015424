

public class MaximumAND {
 
    static int maxAND(int arr[], int n)
    {
        int res = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                res = res > (arr[i] & arr[j])? res: (arr[i] & arr[j]);
 
        return res;
    }
 
    // driver function
    public static void main(String argc[])
    {
        int arr[] = { 3,5,8,10,12 };
        int n = arr.length;
        System.out.println("Maximum AND Value " + maxAND(arr, n));
    }
}
