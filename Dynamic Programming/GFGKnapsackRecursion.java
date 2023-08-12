/* Name: Gracee Ranjan
 * Sap I'D: 1000015424
 * Roll No.: 200102443
 * Technical Training Group: G1
 */

public class GFGKnapsackRecursion {
    public static int knapSack(int W, int wt[], int val[], int n) {
        // Base case: If there are no items left or knapsack capacity is 0
        if (n == 0 || W == 0) {
            return 0;
        }

        // If the weight of the nth item is more than the knapsack capacity,
        // then this item cannot be included in the optimal solution
        if (wt[n - 1] > W) {
            return knapSack(W, wt, val, n - 1);
        }

        // Return the maximum of two cases:
        // 1. nth item included
        // 2. nth item not included
        return Math.max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1), knapSack(W, wt, val, n - 1));
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

