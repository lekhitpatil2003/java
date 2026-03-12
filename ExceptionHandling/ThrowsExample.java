package ExceptionHandling;
import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException{
        FileReader file = new FileReader("abc.txt");
    }
    public static void main(String[] args) throws IOException{
        readFile();
    }
}
