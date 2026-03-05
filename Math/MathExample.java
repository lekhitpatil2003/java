package Math;

public class MathExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Maximum Number
        int maxValue = Math.max(num1, num2);
        System.out.println("Max Value: " + maxValue);

        // Minimum Number
        int minValue = Math.min(num1, num2);
        System.out.println("Min Value: " + minValue);

        // Square Root
        double sqrtValue = Math.sqrt(16);  
        System.out.println("Square Root: " + sqrtValue);

        // Absolute Value        
        int absValue = Math.abs(-5);
        System.out.println("Absolute Value: " + absValue);

        // Power
        double powerValue = Math.pow(2, 3);
        System.out.println("Power Value: " + powerValue);

        // Random Number
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue);

        // Rounding
        double roundValue = Math.round(3.7);
        System.out.println("Rounded Value: " + roundValue);
    }
}
