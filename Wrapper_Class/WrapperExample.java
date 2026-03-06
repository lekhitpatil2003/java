package Wrapper_Class;

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 20.5;
        boolean primitiveBoolean = true;

        // Wrapper classes
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        Boolean wrapperBoolean = Boolean.valueOf(primitiveBoolean);

        // Displaying the values
        System.out.println("Primitive int: " + primitiveInt); // Output: Primitive int: 10
        System.out.println("Wrapper Integer: " + wrapperInt); // Output: Wrapper Integer: 10

        System.out.println("_____________________________________________________________");

        System.out.println("Primitive double: " + primitiveDouble); // Output: Primitive double: 20.5
        System.out.println("Wrapper Double: " + wrapperDouble); // Output: Wrapper Double: 20.5

        System.out.println("_____________________________________________________________");

        System.out.println("Primitive boolean: " + primitiveBoolean); // Output: Primitive boolean: true
        System.out.println("Wrapper Boolean: " + wrapperBoolean); // Output: Wrapper Boolean: true

        System.out.println("_____________________________________________________________");

        String num = "100";
        // Converting String to Integer using wrapper class
        int value = Integer.parseInt(num);
        System.out.println("Converted String to int: " + value); // Output: Converted String to int: 100

        System.out.println("_____________________________________________________________");
    }
}
