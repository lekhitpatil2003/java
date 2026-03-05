package Operators;
public class ArithmeticOperator {
    public static void main(String[] args) {
        //Arithmetic Operators --> +, -, *, /, %
        int a = 5;
        int b = 10;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;

        System.out.println("Addition : " + a + " + " + b + " = " + c ); // Output: 15
        System.out.println("Subtraction : " + a + " - " + b + " = " + d ); // Output: -5
        System.out.println("Multiplication : " + a + " * " + b + " = " + e ); // Output: 50
        System.out.println("Division : " + b + " / " + a + " = " + f );  // Output: 2
        System.out.println("Modulus : " + b + " % " + a + " = " + g ); // Output: 0
    }
}
