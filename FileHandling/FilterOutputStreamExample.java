package FileHandling;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("demo.txt");
            FilterInputStream filter = new FilterInputStream(file) {
            };
            int data;
            while ((data = filter.read()) != -1) {
                System.out.println((char) data);
            }
            filter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
