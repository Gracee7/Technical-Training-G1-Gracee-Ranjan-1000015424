/*public class SuperPower {
    
    public static double calculateSuperpower(double base, int exponent) {
        if (exponent == 0) {
            return 1; // Base case: Anything raised to the power of 0 is 1
        } else if (exponent > 0) {
            return base * calculateSuperpower(base, exponent - 1); // Recursive call: Multiply base with (exponent - 1) times
        } else {
            return 1 / (base * calculateSuperpower(base, -exponent - 1)); // Recursive call: Multiply reciprocal of base with (-exponent - 1) times
        }
    }

    public static void main(String[] args) {
        double base = 2.5;
        int exponent = 3;
        double result = calculateSuperpower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}*/