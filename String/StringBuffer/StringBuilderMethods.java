package String.StringBuffer;

public class StringBuilderMethods {
    public static void main(String[] args) {
        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Lekhit");

        // 1. append() → adds text at the end
        sb.append(" Java");
        System.out.println("After append: " + sb);

        // 2. insert() → inserts text at specific index
        sb.insert(0, "Hello ");
        System.out.println("After insert: " + sb);

        // 3. replace() → replaces characters between indexes
        sb.replace(6, 12, "Students");
        System.out.println("After replace: " + sb);

        // 4. delete() → deletes characters
        sb.delete(0, 6);
        System.out.println("After delete: " + sb);

        // 5. reverse() → reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. length() → returns length of string
        System.out.println("Length: " + sb.length());

        // 7. capacity() → shows current capacity
        System.out.println("Capacity: " + sb.capacity());

        // 8. charAt() → returns character at index
        System.out.println("Character at index 2: " + sb.charAt(2));

        // 9. setCharAt() → modifies character
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);

        // 10. substring() → extracts part of string
        System.out.println("Substring (1 to 5): " + sb.substring(1, 5));

        // 11. ensureCapacity() → increases capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity: " + sb.capacity());

        // 12. trimToSize() → reduces capacity to current length
        sb.trimToSize();
        System.out.println("Capacity after trimToSize: " + sb.capacity());
    }
}
