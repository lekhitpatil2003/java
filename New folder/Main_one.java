class Student {
    int id;
    String name;
    void display(){
        System.out.println("ID: " + id + "  " +"Name: " + name);
    }
}

public class Main_one {
    public static void main(String[] args) {
        Student[] obj = new Student[3];

        obj[0] = new Student();
        obj[0].id = 101;
        obj[0].name = "Lekhit";

        obj[1] = new Student();
        obj[1].id = 102;
        obj[1].name = "Jayesh";
        
        obj[2] = new Student();
        obj[2].id = 103;
        obj[2].name = "Om";

        for(Student s : obj) {
            s.display();
        }
    }
}
