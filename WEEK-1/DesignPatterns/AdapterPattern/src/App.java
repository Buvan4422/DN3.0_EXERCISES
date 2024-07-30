public class App {
    public static void main(String[] args) throws Exception {
        SamSungPay gp = new SamSungPay();
        PaymentProcessor gpadapt = new SSpayAdapter(gp);
        gpadapt.paymentProcess("100 rs");

        Paytm pt = new Paytm();
        PaymentProcessor ptAdapter = new PaytmAdapter(pt);
        ptAdapter.paymentProcess("300 rs");
    }
}
