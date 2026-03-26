import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("Sample.txt");
            if (file.createNewFile()) {
                System.out.println("File Create Successfully : " + file.getName());
            } else {
                System.out.println("File Already Exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
