import java.io.File;
import java.io.IOException;

public class CreateFloderAndFile {
    public static void main(String[] args) {
        try {
            File folder = new File("\"D:\\employeeData\"");
            if (!folder.exists()) {
                folder.mkdir();
            }

            File file = new File("\"D:\\employeeData\\employee.txt\"");
            if (file.createNewFile()) {
                System.out.println("File Create Successfully : " + file.getAbsolutePath());
            } else {
                System.out.println("File Already Exists. ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}