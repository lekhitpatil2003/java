package Operators;
public class AssignmentOperators { 
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Using assignment operator
        a += b; // a = a + b
        System.out.println("After a += b: " + a); // Output: 15

        a -= b; // a = a - b
        System.out.println("After a -= b: " + a); // Output: 10

        a *= b; // a = a * b
        System.out.println("After a *= b: " + a); // Output: 50

        a /= b; // a = a / b
        System.out.println("After a /= b: " + a); // Output: 10

        a %= b; // a = a % b
        System.out.println("After a %= b: " + a); // Output: 0
    }
}