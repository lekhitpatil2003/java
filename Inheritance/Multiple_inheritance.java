// We can take two interfaces 1st is account operation interface which contain account functionality other is loan operation interface which content loan functionality then smart account class implements both the class

//INterface 1
interface AccountOperation{
    void deposit(double amount);
}

//Interface 2
interface LoanOperation{
    void applyForLoan(double amount);
}

//Class which implements both the interface
class SmartAccount implements AccountOperation, LoanOperation{
    String accountHolderName;
    double balance;

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    public void applyForLoan(double amount){
        System.out.println("Loan Approved: " + amount + ". For " + accountHolderName + ". New Balance after loan: " + (balance + amount));
    }
}

//Main class to test the functionality
public class Multiple_inheritance {
    public static void main(String[] args) {
        SmartAccount smartAcc = new SmartAccount();
        smartAcc.accountHolderName = "Jayesh";
        smartAcc.balance = 5000;
        smartAcc.deposit(1000);
        smartAcc.applyForLoan(50000);

    }
}
