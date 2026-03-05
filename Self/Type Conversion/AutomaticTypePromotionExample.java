public class AutomaticTypePromotionExample {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);

        // f * b --> float * byte --> float
        // i / c --> int / char --> int
        // d * s --> double * short --> double

        //float + int --> float - double --> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("The result of the expression is: " + result);

    }
}
