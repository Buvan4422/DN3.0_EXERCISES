import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        PaymentContext context = new PaymentContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select payment method: 1 for Credit Card, 2 for PayPal");
        int c = scanner.nextInt();
        if (c == 1) {
            System.out.println("Enter name:");
            String name = scanner.next();
            System.out.println("Enter card number:");
            String cn = scanner.next();
            System.out.println("Enter CVV:");
            String cvv = scanner.next();
            System.out.println("Enter expiry date:");
            String expdt = scanner.next();

            PaymentStrategy creditCardPayment = new CreditCardPayment(name, cn, cvv, expdt);
            context.setPayMethd(creditCardPayment);
        }
        else if (c == 2) {
            System.out.println("Enter PayPal email:");
            String mailid = scanner.next();
            System.out.println("Enter PayPal upiid:");
            String upiid = scanner.next();

            PaymentStrategy payPalPayment = new PayPalPayment(mailid, upiid);
            context.setPayMethd(payPalPayment);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("Enter amount to pay:");
        int amt = scanner.nextInt();
        context.exePayment(amt);
        scanner.close();
    }
}
