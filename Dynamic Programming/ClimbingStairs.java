public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // Base case: 1 way to climb 0 or 1 step
        }

        int[] dp = new int[n + 1];
        dp[0] = 1; // One way to reach step 0
        dp[1] = 1; // One way to reach step 1

        for (int i = 2; i <= n; i++) {
            // Number of ways to reach step i is the sum of ways to reach step i-1 and i-2
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n]; // Number of ways to reach step n
    }

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        System.out.println("Number of distinct ways to climb " + n1 + " steps: " + climbStairs(n1));
        System.out.println("Number of distinct ways to climb " + n2 + " steps: " + climbStairs(n2));
    }
}

