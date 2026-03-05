package Operators;
public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
        int x = 5;

        // Using increment operator
        x++; // x = x + 1
        System.out.println("After x++: " + x); // Output: 6

        ++x; // x = x + 1
        System.out.println("After ++x: " + x); // Output: 7

        // Using decrement operator
        x--; // x = x - 1
        System.out.println("After x--: " + x); // Output: 6

        --x; // x = x - 1
        System.out.println("After --x: " + x); // Output: 5
    }
}
