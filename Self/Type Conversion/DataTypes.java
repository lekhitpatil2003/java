public class DataTypes {
    public static void main(String[] args){
        //Integer --> byte , short , int , long
        // Binary (2), Octal (8), Decimal (10), Hexadecimal (16) number system
        byte b = 5;
        byte b1 = 0b101; // binary representation, use prefix 0b or 0B for binary literals
        byte b2 = 05; // octal representation, range 0-7, use prefix 0 for octal literals
        byte b3 = 0xc; // hexadecimal representation, range 0-15 & A-F (or a-f), use prefix 0x or 0X for hexadecimal literals
        short s = 10;
        int i = 4000;
        long l = 12_34_56_789; // underscores can be used to improve readability of large numbers, they are ignored by the compiler

        //Real Numbers
        float f = 10.54f; //Single precision
        //double d = 100.5678; //double precision --> standard way
        double d = 6.022e23; //6.022 * 10^23 -->Scientific Way of writing numbers, use 'e' or 'E' to indicate the exponent

        //Characters
        char c = 'a';  // 'a' -> integer value 97 -> binary -> store

        //boolean
        boolean bool = true; // 1 -> true , 0 -> false

        System.out.println("Integer Values --> " + b + " , " + b1 + " , " + b2 + " , " + b3 + " , " + s +" , " + i +" , " + l);
        System.out.println("Floating Values --> " + f + " , " + d);
        System.out.println("Character Value --> " + c);
        System.out.println("Boolean Value --> " + bool);
    }
}