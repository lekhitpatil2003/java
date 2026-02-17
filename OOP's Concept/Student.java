class Student {
    static String SchoolName = "ABC School"; // Static variable shared by all instances
    String name; // Instance variable unique to each instance

    Student(String name) {
        this.name = name; // Constructor to initialize the instance variable
    }

    public void Display(){
        System.out.println("Name: " + name + ", School: " + SchoolName);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Yogesh Nana");
        Student student2 = new Student("Jayesh");

        student1.Display();
        student2.Display();
    }
}