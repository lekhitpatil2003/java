package ExceptionHandling;

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            int arr[] = { 10, 20, 30, 40 };
            System.out.println(arr[3]);

            try {
                int a = 10;
                int b = 0;
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot Divided by Zero ...");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
