package Recursion;

public class recursion {
    static void Funct(int n) {
        if (n > 0) {
            // System.out.println(n);  // This will print the numbers in reverse order : 0utput: 5 4 3 2 1
            Funct(n-1);
            System.out.println(n); // This will print the numbers in order : 0utput: 1 2 3 4 5
        }
    }
    public static void main(String[] args) {
        int n = 5;
        // System.out.println(factorial(n));
        Funct(n);
    }
}
//factorial