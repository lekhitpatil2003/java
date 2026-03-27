import java.io.*;

public class FileDescriptorExample {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("test.txt");
        FileDescriptor fd = fos.getFD();
        System.out.println("Valid ID : " + fd.valid());
        fos.write("hello".getBytes());
        fos.close();
    }
} 