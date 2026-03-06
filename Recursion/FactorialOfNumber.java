package Recursion;

public class FactorialOfNumber {
    // Recursive method to calculate factorial
    static int Factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        }
        return n * Factorial(n - 1); // Recursive case
    }
    public static void main(String[] args) {
        int n = 5;
        int result = Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
