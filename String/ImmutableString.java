package String;

public class ImmutableString {
    public static void main(String[] args) {
        String str = "Lekhit";
        str.concat(" Java");
        System.out.println(str);  // Lekhit

        String str1 = "Lekhit";
        str1 = str1.concat(" Java");
        System.out.println(str1); // Lekhit Java
    }
}
