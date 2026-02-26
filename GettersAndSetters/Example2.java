package GettersAndSetters;

class Employee {
    private double salary;

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Amount.....!!!");
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setSalary(5000);
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
