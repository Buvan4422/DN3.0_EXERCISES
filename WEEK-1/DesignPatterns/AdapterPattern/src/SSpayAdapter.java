public class SSpayAdapter implements PaymentProcessor {
    private SamSungPay pay;
    public SSpayAdapter(SamSungPay pay) {
        this.pay = pay;
    }
    @Override
    public void paymentProcess(String amount) {
        pay.payKaro(amount);
    }
}
