/* Name: Gracee Ranjan
 * Sap I'D: 1000015424
 * Roll No.: 200102443
 * Technical Training Group: G1
 */
public class GFGSubsetSumTabulationDP {
    public static boolean isSubsetSum(int[] arr, int N, int sum) {
        boolean[][] dp = new boolean[N + 1][sum + 1];

        // Base case: If sum is 0
        for (int i = 0; i <= N; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    // Either include the current element or exclude it
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    // Exclude the current element
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[N][sum];
    }

    public static void main(String[] args) {
        int N = 6;
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        boolean result = isSubsetSum(arr, N, sum);
        if (result) {
            System.out.println("1"); // Subset with sum found
        } else {
            System.out.println("0"); // Subset with sum not found
        }
    }
}

