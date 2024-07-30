public class PaytmAdapter implements PaymentProcessor{
    private Paytm pay;
    public PaytmAdapter(Paytm pay) {
        this.pay = pay;
    }
    @Override
    public void paymentProcess(String amt){
        pay.payKaro(amt);
    }

}
