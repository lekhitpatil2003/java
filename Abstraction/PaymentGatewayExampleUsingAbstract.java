package Abstraction;

import java.util.Scanner;

/*Using an abstract class like Payment for supporting multiple payment types allows structured code reuse, extensibility, and shared logic for all payment implementations. Each payment type (such as CreditCardPayment, UpiPayment, etc.) inherits from the abstract class and provides its own specific processing logic by overriding its abstract methods. New payment types can be added later simply by creating a new subclass, without changing the core structure, making the system open for extension and closed for modification.*/

// Abstract class defines the contract for all payments
abstract class Payment {

    public abstract void processPayment(double amount);

    public abstract void generateReceipt();
}

// Credit Card Payment Implementation
class CreditCardPayment extends Payment {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs " + amount + " using Card Number: " + cardNumber);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit Card Payment Receipt Generated.");
    }
}

// UPI Payment Implementation
class UpiPayment extends Payment {

    private final String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs " + amount + " using UPI ID: " + upiId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI Payment Receipt Generated.");
    }
}

// Net Banking Payment Implementation
class NetBankingPayment extends Payment {

    private final String userId;

    public NetBankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking Payment of Rs " + amount + " for User ID: " + userId);
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net Banking Payment Receipt Generated.");
    }
}

// Service that uses abstraction
class PaymentService {

    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.processPayment(amount);
        payment.generateReceipt();
    }
}

// Main Program
public clasmentGatewayExampleUsingAbstract {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Select Payment Method: 1. Credit Card  2. UPI  3. Net Banking");
            int choice = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Amount: ");
            double amount = Double.parseDouble(scanner.nextLine());

            Payment payment;

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
                    throw new Exception("Invalid choice!");
            }

            PaymentService service = new PaymentService(payment);
            service.executePayment(amount);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values where required.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}