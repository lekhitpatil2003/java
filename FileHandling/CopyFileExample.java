package FileHandling;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("demo.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream("output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            int data;
            while ((data = bis.read()) != -1) {
                bos.write(data);
            }

            bos.flush();
            bis.close();
            bos.close();

            System.out.println("File Copied Successfully.");
        } catch (Exception e) {
            
        }
    }
}
