import java.util.ArrayList;
import java.util.Scanner;

// Create Base Class (BankAccount)
class BankAccount {
    private int accountNumber;
    private String name;
    protected double balance;

    // Constructor
    BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.balance = balance;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    String getName() {
        return name;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println("Acc No: " + accountNumber + ", Name: " + name + ", Balance: " + balance);
    }
}

// Create Child Classes (Inheritance)
class SavingsAccount extends BankAccount {
    double interestRate = 5;

    SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit = 1000;

    CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn with overdraft: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}

public class Bank_Management_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Acc No: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    accounts.add(new SavingsAccount(accNo, name, bal));
                    System.out.println("Savings Account Created!");
                    break;

                case 2:
                    System.out.print("Enter Acc No: ");
                    int accNo2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name2 = sc.nextLine();

                    System.out.print("Enter Balance: ");
                    double bal2 = sc.nextDouble();

                    accounts.add(new CurrentAccount(accNo2, name2, bal2));
                    System.out.println("Current Account Created!");
                    break;

                case 3:
                    System.out.print("Enter Acc No: ");
                    int dAcc = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double dAmt = sc.nextDouble();

                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber() == dAcc) {
                            acc.deposit(dAmt);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Acc No: ");
                    int wAcc = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wAmt = sc.nextDouble();

                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber() == wAcc) {
                            acc.withdraw(wAmt); // polymorphism
                        }
                    }
                    break;

                case 5:
                    for (BankAccount acc : accounts) {
                        acc.display();
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
