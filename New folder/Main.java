// Step 1: Create interface
interface MyInterface {
    int add(int a, int b);
}

// Step 2: Main class
public class Main {
    public static void main(String[] args) {

        MyInterface obj = (a, b) -> a + b;

        int result = obj.add(5, 3);

        System.out.println("Sum = " + result);
    }
} 