package Super;

class Employee {
    String Company;

    Employee(String company) {
        this.Company = company;
        System.out.println("Employee Constructor called...");
    }

    void getDetails(){
        System.out.println("Company: " + Company);
    }
}

class Manager extends Employee {
    String Department;

    Manager(String Company, String Department){
        super(Company);
        this.Department = Department;
        System.out.println("Manager Constructor called...");
    }

    void getDetails(){
        getDetails();
        System.out.println("Department: " + Department);
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Manager Data = new Manager("ABC Company", "IT Department");
        Data.getDetails();
    }
}