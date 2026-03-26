import java.io.File;
import java.io.IOException;

public class CreateFileWithPath {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Github_Clone_Repo\\java\\FileHandling\\demo.txt");
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getAbsolutePath());
            } else {
                System.out.println("File Already Exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
