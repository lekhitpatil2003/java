import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // put() -- add elements
        map.put(101, "Lekhit");
        map.put(102, "Jayesh");
        map.put(103, "Yogesh");

        // get value
        System.out.println(map.get(101));
        
        // Check key
        System.out.println(map.containsKey(102));

        // remove data
        map.remove(103);

        // Iteration
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
