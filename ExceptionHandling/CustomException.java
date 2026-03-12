package ExceptionHandling;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount{
    int balance = 5000;
    void withdraw (int amount) throws InsufficientBalanceException{
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance ... ");            
        }
        balance =- amount;
        System.out.println(balance);
    }
}

public class CustomException {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();

        try{
            obj.withdraw(6000);
        } catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}