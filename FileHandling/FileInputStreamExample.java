package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Execution handled : " + e.getMessage());
        }
    }
}