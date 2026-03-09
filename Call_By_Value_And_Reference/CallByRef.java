package ;

class Student{
    int marks;
}

public class CallByRef {
    public static void changeValue(Student s) {
        
    }
    public static void main(String[] args) {
        Student obj = new Student();
        obj.marks = 90;

        changeValue(obj);
        System.out.println(obj.marks);
    }
}
