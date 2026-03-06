package Wrapper_Class;

public class IntegerCaches {
    // Caches for wrapper classes
    // Integer cache for values from -128 to 127
    public static void main(String[] args) {
     
    Integer a = 100;
    Integer b = 100;
    System.out.println(a == b); // Output: true (cached)
    System.out.println(a.equals(b)); // Output: true

    Integer c = 200;
    Integer d = 200;
    System.out.println(c == d); // Output: false (not cached)
    System.out.println(c.equals(d)); // Output: true
    }
}
