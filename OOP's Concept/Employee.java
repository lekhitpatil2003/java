public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Constructor called ......");
    }

    void EmployeeDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args){
        
        System.out.println("Main method called ......");

        Employee emp1 = new Employee("Jaggu", 5.00);
        emp1.EmployeeDetails();
    }
}
