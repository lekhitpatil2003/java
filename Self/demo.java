public class demo {
    public static void main(String[] args){
        //Integer --> byte , short , int , long
        // Binary (2), Octal (8), Decimal (10), Hexadecimal (16) number system
        //byte b = 5;
        //byte b = 0b101; // binary representation, use prefix 0b or 0B for binary literals
        //byte b = 05; // octal representation, range 0-7, use prefix 0 for octal literals
        //byte b = 0x5; // hexadecimal representation, range 0-15 & A-F (or a-f), use prefix 0x or 0X for hexadecimal literals
        short s = 10;
        int i = 4000;
        long l = 10000;

        //Real Numbers
        float f = 10.54f;
        double d = 100.5678;

        //Characters
        char c = 'a';  // 'a' -> integer value 97 -> binary -> store

        //boolean
        boolean bool = true; // 1 -> true , 0 -> false

        System.out.println("Integer Values --> " + b + " , " + s +" , " + i +" , " + l);
        System.out.println("Floating Values --> " + f + " , " + d);
        System.out.println("Character Value --> " + c);
        System.out.println("Boolean Value --> " + bool);
    }
}