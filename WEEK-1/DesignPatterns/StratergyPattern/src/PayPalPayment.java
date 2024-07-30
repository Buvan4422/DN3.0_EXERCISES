public class PayPalPayment implements PaymentStrategy{
    @SuppressWarnings("unused")
    private String mailid,upid;

    public PayPalPayment(String mailid, String upid) {
        this.mailid = mailid;
        this.upid = upid;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
