import java.util.*;

public class HashMapAllMethodsDemo {

    public static void main(String[] args) {

        // 1. Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // =============================
        // 🔹 ADD METHODS
        // =============================

        map.put(101, "Pranav");
        map.put(102, "Amit");
        map.put(103, "Ravi");

        // putIfAbsent()
        map.putIfAbsent(104, "Suresh");

        System.out.println("After adding: " + map);

        // =============================
        // 🔹 GET METHODS
        // =============================

        System.out.println("Get key 101: " + map.get(101));

        // getOrDefault()
        System.out.println("Get key 999: " + map.getOrDefault(999, "Not Found"));

        // =============================
        // 🔹 CHECK METHODS
        // =============================

        System.out.println("Contains key 102: " + map.containsKey(102));
        System.out.println("Contains value Ravi: " + map.containsValue("Ravi"));

        // =============================
        // 🔹 SIZE & EMPTY
        // =============================

        System.out.println("Size: " + map.size());
        System.out.println("Is Empty: " + map.isEmpty());

        // =============================
        // 🔹 UPDATE METHODS
        // =============================

        // replace()
        map.replace(101, "Rahul");

        // replace(key, oldValue, newValue)
        map.replace(102, "Amit", "Akash");

        // compute()
        map.compute(103, (key, value) -> value + " Updated");

        // computeIfAbsent()
        map.computeIfAbsent(105, k -> "NewUser");

        // computeIfPresent()
        map.computeIfPresent(104, (k, v) -> v + " Present");

        // merge()
        map.merge(106, "MergeUser", (oldVal, newVal) -> oldVal + newVal);

        System.out.println("After update: " + map);

        // =============================
        // 🔹 REMOVE METHODS
        // =============================

        map.remove(105);

        // remove(key, value)
        map.remove(106, "MergeUser");

        System.out.println("After remove: " + map);

        // =============================
        // 🔹 ITERATION METHODS
        // =============================

        System.out.println("---- keySet() ----");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("---- values() ----");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---- entrySet() ----");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // forEach()
        System.out.println("---- forEach ----");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // =============================
        // 🔹 OTHER METHODS
        // =============================

        // clone()
        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned Map: " + cloneMap);

        // clear()
        cloneMap.clear();
        System.out.println("After clear cloneMap: " + cloneMap);

        // =============================
        // 🔹 KEYSET TO ARRAY
        // =============================
        Object[] keys = map.keySet().toArray();
        System.out.println("Keys as array: " + Arrays.toString(keys));
    }
}