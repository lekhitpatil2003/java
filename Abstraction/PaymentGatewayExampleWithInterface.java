package Abstraction;
import java.util.Scanner;

// Interface to define a contract for all payment methods
interface IPayment {
    void processPayment(double amount);

    void generateReceipt();
}

// Credit Card Payment Implementation
class CreditCardPayment implements IPayment {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("💳 Processing Credit Card Payment of ₹" + amount +
                " using Card Number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("📄 Credit Card Payment Receipt Generated.");
    }
}

// UPI Payment Implementation
class UpiPayment implements IPayment {

    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("📲 Processing UPI Payment of ₹" + amount +
                " using UPI ID: " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("📄 UPI Payment Receipt Generated.");
    }
}

// Net Banking Payment Implementation
class NetBankingPayment implements IPayment {

    private String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("🏦 Processing Net Banking Payment of ₹" + amount +
                " for User ID: " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("📄 Net Banking Payment Receipt Generated.");
    }
}

// Service that uses IPayment for processing
class PaymentService {

    private IPayment payment;

    public PaymentService(IPayment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.processPayment(amount);
        payment.generateReceipt();
    }
}

// Main Program
public class PaymentGatewayExampleWithInterface {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Method: 1. Credit Card  2. UPI  3. Net Banking");
        int choice = scanner.nextInt();

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume leftover newline

        IPayment payment;

        switch (choice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.print("Enter Net Banking User ID: ");
                String userId = scanner.nextLine();
                payment = new NetBankingPayment(userId);
                break;

            default:
                System.out.println("Invalid choice!");

                scanner.close();
                return;
        }

        PaymentService service = new PaymentService(payment);
        service.executePayment(amount);

        scanner.close();
    }
}