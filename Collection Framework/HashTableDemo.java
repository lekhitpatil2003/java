import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        // Creating Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // put() -- add elements
        table.put(1, "C++");
        table.put(2, "Java");
        table.put(3, "Python");

        // get()
        System.out.println("Value of key 2: " + table.get(2));

        // remove()
        // table.remove(3);
        // System.out.println(table.containsKey(3));

        // containsKey()
        System.out.println("Contains key 1 : " + table.containsKey(1));

        // ContainsValue()
        System.out.println("Contains value Java : " + table.containsValue("Java"));

        // size()
        System.out.println("Size : " + table.size());

        // iteration
        for (Integer key : table.keySet()) {
            System.out.println(key + " -> " + table.get(key));
        }
    }
}
