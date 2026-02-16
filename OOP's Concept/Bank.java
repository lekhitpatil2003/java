class BankAccount {
    // Fields
    private String accountNumber;
    private double balance;
 
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
 
    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }
 
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
 
    // Balance is read‑only from outside
    public double getBalance() {
        return balance;
    }
 
    // Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited " + amount + ". New balance is " + balance);
    }
 
    // Method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }
}
 
public class Car {
    public static void main(String[] args) {
 
        // Create an object
 
        BankAccount pranavAccount = new BankAccount("ACC123", 5000.0);
 
        // Show details
        pranavAccount.displayAccountInfo();
 
        // Perform a deposit
        pranavAccount.deposit(1000);
 
        // // Display balance
        System.out.println("Final Balance: " + pranavAccount.getBalance());
 
    }
}