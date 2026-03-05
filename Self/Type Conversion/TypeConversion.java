public class TypeConversion {
    public static void main(String[] args) {
        // Implicit Conversion
            //1. byte to int
        byte b = 24;
        int i;
        i = b;
        System.out.println("Convert byte to int : " + i); //24

            //2. Character to int
        char c = 'a';
        int i1;
        i1 = c;
        System.out.println("Convert Char to int : " + i1); //97 - Unicode Value

        // Explicit Conversion
        int i2 = 300;
        byte b2;   //Range -128 to 127
        //b2 = i2;  //this not possible gives error 
        b2 = (byte) i2;  //it's working 
        System.out.println("Convert int to byte (Range -128 to 127) : " + b2);  //44 because   300 % 256 = 44

        // Truncating Conversion
        float f = 15.687f;
        int i3;
        i3 = (int) f;
        System.out.println("Convert float to int : " + i3); //15

        // boolean to any data type 
        // These conversion are not possible
        // boolean b4 = true;
        // int i4;
        // i4 = (int) b4;  // not possible because boolean is not compatible with any other data type

        //Automatic Type Promotion in Expressions
        byte b4 = 50;
        //b = b * 2; // this is not possible because the result of b*2 is int and it cannot be assigned to byte without explicit casting
        b4 = (byte) (b4 * 2); // this is working because we are explicitly casting the result to byte
        System.out.println("Automatic Type Promotion in Expressions : " + b4); //100


    }
}