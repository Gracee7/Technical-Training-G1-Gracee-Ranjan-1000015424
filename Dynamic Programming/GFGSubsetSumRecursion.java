/* Name: Gracee Ranjan
 * Sap I'D: 1000015424
 * Roll No.: 200102443
 * Technical Training Group: G1
 */
public class GFGSubsetSumRecursion {
    public static boolean hasSubsetWithSum(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Base cases: for an empty subset, sum = 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                // If the current element is greater than the target sum,
                // we can't include it in the subset.
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Otherwise, we have two options:
                    // 1. Include the current element in the subset
                    // 2. Exclude the current element from the subset
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println("Output: " + (hasSubsetWithSum(arr, sum) ? 1 : 0));
    }
}

