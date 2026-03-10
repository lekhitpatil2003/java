package String;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Lekhit";
        String nametrim = "           Lekhit           ";

        System.out.println("1. Length of name : " + name.length());   // 1. lenght()
        System.out.println("2. Lowercase of name : " + name.toLowerCase());   // 2. toLowerCase()
        System.out.println("3. Uppercase of name : " + name.toUpperCase());   // 3. toUpperCase()
        System.out.println("4. Trimmed String : " + nametrim.trim());   // 4. trim()
        System.out.println("5. Substring from 3 index : " + name.substring(3));   // 5. substring()
        System.out.println("6. Substring Start from 2 index and End 4 index : " + name.substring(2,4));   // 6. substring(start, end)
        System.out.println("7. Replace Character 'e' to 'i' : " + name.replace("e", "i"));   // 7. replace()
        System.out.println("8. check start with of name : " + name.startsWith("Lek"));   // 8. startwith()
        System.out.println("9. check end with of name : " + name.endsWith("it"));   // 9. endswith()
        System.out.println("10. find char at 3 index : " + name.charAt(3));   // 10. charAt()
        System.out.println("11. find 't' char index : " + name.indexOf("t"));   // 11. indexOf()
        System.out.println("12. Checks substring 'u' contains : " + name.contains("u"));   // 12.contains()

        String num = "1234";
        int numn = Integer.parseInt(num);
        System.out.println("13. convert a String into an integer (int) : " + numn);

    }
}
