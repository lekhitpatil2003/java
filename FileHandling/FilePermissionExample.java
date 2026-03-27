import java.io.FilePermission;

public class FilePermissionExample {
    public static void main(String[] args) {
        FilePermission permission = new FilePermission("sample.txt", "read");
        System.out.println("File : "+permission.getName());
        System.out.println("Actions : "+permission.getActions());
    }
}