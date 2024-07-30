public class CreditCardPayment implements PaymentStrategy{
    @SuppressWarnings("unused")
    private String name,cn,cvv,expdt;

    public CreditCardPayment(String name, String cn, String cvv, String expdt) {
        this.name = name;
        this.cn = cn;
        this.cvv = cvv;
        this.expdt = expdt;
    }

    @Override
    public void pay(int amt) {
        System.out.println(amt + " paid with credit card.");
    }
}
