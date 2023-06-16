 public class MissingNum {
    public static int findMissingNumb(int[] nums, int n) {
        if (n == 1) {
            return 1; // Base case If there is only one element, return 1
        } else {
            return n + findMissingNumb(nums, n - 1) - nums[n - 2];
            // Recursive call for calculating the Sum of n and the result of the function for n-1 minus the (n-1)th element
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumb(arr, arr.length + 1);
        System.out.println("The missing number in the array is : " + missingNumber);
    }
}
