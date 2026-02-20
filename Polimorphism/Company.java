package Polimorphism;

class Employee {
    String name;
    double BaseSalary;

    double calculateSalary() {
        return BaseSalary;
    }
    void ShowDetails(){
        System.out.println("Name :" + name + " Salary :" + calculateSalary());
    }
}

class FullTimeEmployee extends Employee{
    double bonus;

    @Override
    double calculateSalary() {
        return BaseSalary + bonus;
    }
    @Override
    void ShowDetails(){
        System.out.println("Name :" + name + " Bonus :" + bonus + " Salary :" + calculateSalary());
    }
}

class PartTimeEmployee extends Employee{
    double HouseRent;

    @Override
    double calculateSalary() {
        return BaseSalary + HouseRent;
    }
    @Override
    void ShowDetails(){
        System.out.println("Name :" + name + " Salary :" + calculateSalary());
    }
}

class TemporaryEmployee extends Employee {
    //in this temporary employee salary calculation is depend upon the per-day Salary and present-days
    int presentDays;
    double perDaySalary;
    @Override
    double calculateSalary() {
        return presentDays * perDaySalary;
    }
    void ShowDetails(){
        System.out.println("Name :" + name + " Salary :" + calculateSalary() + " Present Days :" + presentDays + " Per Day Salary :" + perDaySalary);
    }
}

public class Company {
    public static void main(String[] args) {
        FullTimeEmployee FTE = new FullTimeEmployee();
        FTE.name = "Yogesh";
        FTE.BaseSalary = 50000.00;
        // FTE.bonus = 5000.00;
        ((FullTimeEmployee) FTE).bonus = 5000.00;
        FTE.ShowDetails();

        PartTimeEmployee PTE = new PartTimeEmployee();
        PTE.name = "Jayesh";
        PTE.BaseSalary = 3000.00;
        PTE.HouseRent = 100000.00;
        PTE.ShowDetails();

        TemporaryEmployee TE = new TemporaryEmployee();
        TE.name = "Vaibhav";
        TE.presentDays = 20;
        TE.perDaySalary = 1000.00;  
        TE.ShowDetails();
    }
}
