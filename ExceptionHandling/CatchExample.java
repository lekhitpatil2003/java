package ExceptionHandling;

// we can handle multiple exception using multiple catch block
public class CatchExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);

            int arr[] = {10, 20, 30, 40};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Dose not Exist ...");
        } catch (ArithmeticException e){
            System.out.println("Cannot Divide by Zero ...");
        }
        System.out.println("Program Continue ...");
    }
}
