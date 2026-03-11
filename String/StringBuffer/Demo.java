package String.StringBuffer;
import java.util.StringTokenizer;

public class Demo {
    public static void main(String[] args) {
        String str = "Java | Python | C#";

        /*
            how to print this way
            Java
            Python
            C#
        */

        StringTokenizer st = new StringTokenizer(str, " | ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
