package GettersAndSetters;

class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        // Student Pratik = new Student();
        // Pratik.id = 101;
        // Pratik.name = "Pratik";
        // System.out.println("Student id is: " + Pratik.id);
        // System.out.println("Student name is: " + Pratik.name);

        Student Pratik = new Student();
        Pratik.setId(101);
        Pratik.setName("Pratik");
        System.out.println("Student id: " + Pratik.getId());
        System.out.println("Student name: " + Pratik.getName());
    }
}
