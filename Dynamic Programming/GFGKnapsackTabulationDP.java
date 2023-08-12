/* Name: Gracee Ranjan
 * Sap I'D: 1000015424
 * Roll No.: 200102443
 * Technical Training Group: G1
 */
public class GFGKnapsackTabulationDP {
    public static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int N = 3;
        int W = 4;
        int values[] = {1, 2, 3};
        int weight[] = {4, 5, 1};

        int result = knapSack(W, weight, values, N);
        System.out.println("Maximum value: " + result);
    }
}

