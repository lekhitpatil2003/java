package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("demo.txt");
            FileInputStream fis2 = new FileInputStream("sample.txt");

            SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

            int i;
            while ((i = sis.read()) != -1) {
                System.out.println((char) i);
            }

            sis.close();
            fis1.close();
            fis2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
