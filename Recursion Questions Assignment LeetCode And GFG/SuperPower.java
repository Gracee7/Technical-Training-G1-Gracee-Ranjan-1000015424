public class SuperPower {
    public static double Superpower(double base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: Anything raised to the power of 0 is 1
        } else if (exponent > 0) {
            return base * Superpower(base, exponent - 1); // Recursive call for Multiplying base with (exponent - 1) times
        } else {
            return 1 / (base * Superpower(base, -exponent - 1)); // Recursive call for Multiplying reciprocal of base with (-exponent - 1) times
        }
    }

    public static void main(String[] args) {
        double base = 3.2;
        int exponent = 6;
        double result = Superpower(base, exponent);
        System.out.println("Super Power For "+ base + " raised to the power of " + exponent + " is: " + result);
    }
}