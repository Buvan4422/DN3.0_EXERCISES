public class Ordr {
    private int ordId;
    private String cusName;
    private double total;

    public Ordr(int ordId, String cusName, double total) {
        this.ordId = ordId;
        this.cusName = cusName;
        this.total = total;
    }

    public int getOrdrId() { return ordId; }
    public String getcusName() { return cusName; }
    public double getTotalPrice() { return total; }

    @Override
    public String toString() {
        return "Order ID: " + ordId + ", cus: " + cusName + ", Total Price: " + total;
    }
}