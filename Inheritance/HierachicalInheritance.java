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

class PrimiumSavingAccount extends SavingAccount {
    double bonusRate;

    void ApplyBonusRate(){
        double bonus = balance * bonusRate/100;
        balance += bonus;
        System.out.println("Bonus Amount: " + bonus + " " +" New balance: " + balance);
    }
}

class currentAccount extends Account {
    double overdraftLimit;
    void DisplayLimit(){
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
class HierachicalInheritance {
    public static void main(String[] args) {

        // 1st object for PrimiumSavingAccount
        PrimiumSavingAccount ac = new PrimiumSavingAccount();
        ac.name = "Yogesh Nana";
        ac.balance = 1000.0;
        ac.interestRate = 5;
        ac.bonusRate = 2;

        System.out.println("Account Holder: " + ac.name);
        System.out.println("Initial Balance: " + ac.balance);
        System.out.println("Interest Rate: " + ac.interestRate);

        ac.deposit(500.0);
        ac.ApplyInterestRate();
        ac.ApplyBonusRate();

        // 2nd object for currentAccount
        currentAccount ca = new currentAccount();
        ca.name = "Rahul Sharma";
        ca.balance = 2000.0;
        ca.overdraftLimit = 500.0;

        System.out.println("\nAccount Holder: " + ca.name);
        System.out.println("Initial Balance: " + ca.balance);
        ca.DisplayLimit();
    }
}
