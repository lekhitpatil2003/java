//Level 1: Account
class Account {
    String AccountHolderName;
    Double Balance;

    void deposit(Double amount) {
        Balance += amount;
        System.out.println("Deposit Amount: " + amount + " " +" New balance: " + Balance);
    }
}

//Level 2: SavingAccount
class SavingAccount extends Account {
    double InterestRate;

    void ApplyInterestRate(){
        double interest = Balance * InterestRate/100;
        Balance += interest;
        System.out.println("Interest Amount: " + interest + " " +" Current balance: " + Balance);
    }
}

//Level 3: PrimiumSavingAccount
class PrimiumSavingAccount extends SavingAccount {
    double BonusRate;

    void ApplyBonusRate(){
        double bonus = Balance * BonusRate/100;
        Balance += bonus;
        System.out.println("Bonus Amount: " + bonus + " " +" New balance: " + Balance);
    }
}

//Main class (Usage)
public class MultiLevelExample {
    public static void main(String[] args) {
        PrimiumSavingAccount ac = new PrimiumSavingAccount();
        ac.AccountHolderName = "Yogesh Nana";
        ac.Balance = 1000.0;
        ac.InterestRate = 5;
        ac.BonusRate = 2;

        System.out.println("Account Holder: " + ac.AccountHolderName);
        System.out.println("Initial Balance: " + ac.Balance);
        System.out.println("Interest Rate: " + ac.InterestRate);
        System.out.println("Bonus Rate: " + ac.BonusRate);

        ac.deposit(500.0);
        ac.ApplyInterestRate();
        ac.ApplyBonusRate();
    }    
}
