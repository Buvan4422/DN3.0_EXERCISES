public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPayMethd(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void exePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
