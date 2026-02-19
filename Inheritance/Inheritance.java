class Account {
    String name;
    Double balance;

    void deposit(Double amount) {
        balance += amount;
        System.out.println("Deposit Amount: " + amount + " " +" New balance: " + balance);
    }
}

class SavingAccount extends Account {
    double interestRate;

    void ApplyInterestRate(){
        double interest = balance * interestRate/100;
        balance += interest;
        System.out.println("Interest Amount: " + interest + " " +" Current balance: " + balance);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        SavingAccount ac = new SavingAccount();
        ac.name = "Yogesh Nana";
        ac.balance = 1000.0;
        ac.interestRate = 5;

        System.out.println("Account Holder: " + ac.name);
        System.out.println("Initial Balance: " + ac.balance);
        System.out.println("Interest Rate: " + ac.interestRate);

        ac.deposit(500.0);
        ac.ApplyInterestRate();
    }
}
