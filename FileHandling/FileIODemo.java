package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {
        try {
            //Writing into file
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String message = "Java File I/O Example";
            fos.write(message.getBytes());
            fos.close();
            System.out.println("Data written Successfully.");

            //Reading from file
            FileInputStream fis = new FileInputStream("sample.txt");
            int data;
            System.out.println("File content : ");
            while((data = fis.read()) != -1) {
                System.out.println((char) data);
            }
            fis.close();

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
