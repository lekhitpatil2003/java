import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        //Adding elements
        names.add("Lekhit");
        names.add("Yogesh");
        names.add("Vaibhav");
        names.add("Om");

        System.out.println(names);

        System.out.println(names.get(1));

        //remove element
        names.remove("Vaibhav");

        // print all element
        System.out.println(names);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(num);

        num.remove(Integer.valueOf(2));
        System.out.println(num);
    }
}
