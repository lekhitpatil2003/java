public class Employee1 {
    String name;
    double salary;

    Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Constructor called ......");
    }

    Employee1(Employee1 emp) {
        this.name = emp.name;
        this.salary = emp.salary;
        System.out.println("Employee Copy Constructor called ......");
    }

    void EmployeeDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Salary : " + salary);
    }

    public static void main(String[] args){
        
        System.out.println("Main method called ......");

        Employee1 emp1 = new Employee1("Yogesh Nayak", 5.00);
        emp1.EmployeeDetails();

        Employee1 emp2 = new Employee1(emp1);
        emp2.EmployeeDetails();
    }
}
