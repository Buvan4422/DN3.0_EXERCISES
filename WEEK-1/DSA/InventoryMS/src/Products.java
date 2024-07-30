public class Products {
    private int prdId;
    private String prdName;
    private int quantity;
    private double price;

    public Products(int prdId, String prdName, int quantity, double price) {
        this.prdId = prdId;
        this.prdName = prdName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getPrdId() {
        return prdId;
    }

    public void setPrdId(int prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PrdID: " + prdId + ", Name: " + prdName + ", Quantity: " + quantity + ", Price: " + price;
    }
}