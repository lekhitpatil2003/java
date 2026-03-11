package String.StringBuffer;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Lekhit");

        sb.append(" Java Developer.");
        System.out.println(sb);

        System.out.println(sb.insert(0, 'P'));

        System.out.println(sb.replace(2, 04, "ABC"));

        System.out.println(sb.delete(2, 4));

        System.out.println(sb.reverse());

        System.out.println(sb.charAt(2));
    }
}
