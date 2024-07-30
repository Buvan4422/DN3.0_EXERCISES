public class EcomSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Wireless Mouse", "Electronics"),
            new Product(2, "Running Shoes", "Fashion"),
            new Product(3, "Fiction Novel", "Books"),
            new Product(4, "Bluetooth Speaker", "Electronics"),
            new Product(5, "Backpack", "Accessories")
        };

        // Linear Search
        Product res1 = Search.linearSearch(products, "Wireless Mouse");
        System.out.println(res1 != null ? res1 : "Product not found");
        Product res2 = Search.linearSearch(products, "pen");
        System.out.println(res2 != null ? res2 : "Product not found");

        // Binary Search
        Product r1 = Search.binarySearch(products, "Fashion");
        System.out.println(r1 != null ? r1 : "Product not found");
        Product r2 = Search.binarySearch(products, "Backpack");
        System.out.println(r2 != null ? r2 : "Product not found");
    }
}