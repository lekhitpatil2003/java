package ExceptionHandling;

/*
    finally block always execute even if execution occure or not it always run.
    Used to cleanup work
        closing database connection
        releasing memory / resources
*/

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println(e);
        } finally {
            System.out.println("finally block execute");
        }
    }
}
