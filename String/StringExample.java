package String;

public class StringExample {
    public static void main(String[] args) {
        String name1 = "Lekhit";
        String name2 = "Lekhit";
        //System.out.println(name);
        System.out.println(name1 == name2); // true , it compare value because it stored in string constant pool

        String name3 = new String("Lekhit");
        String name4 = new String("Lekhit");
        System.out.println(name3 == name4); // false because assignment operator compare memory address
        System.out.println(name3.equals(name4)); // true , it compare value
    }
}
