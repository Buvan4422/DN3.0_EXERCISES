import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    private Map<Integer, Products> invt;

    public InventoryManagementSystem() {
        this.invt = new HashMap<>();
    }

    public void addProduct(Products prd) {
        if (invt.containsKey(prd.getPrdId())) {
            System.out.println("Product with ID " + prd.getPrdId() + " already exists.");
        } else {
            invt.put(prd.getPrdId(), prd);
            System.out.println("Product " + prd.getPrdName() + " added.");
        }
    }

    public void updateProduct(int prdId, String prdName, Integer quantity, Double price) {
        if (invt.containsKey(prdId)) {
            Products prd = invt.get(prdId);
            if (prdName != null) {
                prd.setPrdName(prdName);
            }
            if (quantity != null) {
                prd.setQuantity(quantity);
            }
            if (price != null) {
                prd.setPrice(price);
            }
            System.out.println("Product " + prdId + " updated.");
        } else {
            System.out.println("Product with ID " + prdId + " not found.");
        }
    }

    public void deleteProduct(int prdId) {
        if (invt.containsKey(prdId)) {
            invt.remove(prdId);
            System.out.println("Product " + prdId + " deleted.");
        } else {
            System.out.println("Product with ID " + prdId + " not found.");
        }
    }

    public void displayInventory() {
        for (Products prd : invt.values()) {
            System.out.println(prd);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.println("Enter Product ID:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Product Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Quantity:");
                    int qty = sc.nextInt();
                    System.out.println("Enter Price:");
                    double rate = sc.nextDouble();
                    Products newProduct = new Products(id, name, qty, rate);
                    ims.addProduct(newProduct);
                    break;

                case 2:
                    System.out.println("Enter Product ID to update:");
                    int updateId = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Enter new Product Name (or leave blank to keep current):");
                    String updateName = sc.nextLine();
                    System.out.println("Enter new Quantity (or leave blank to keep current):");
                    String quantityStr = sc.nextLine();
                    System.out.println("Enter new Price (or leave blank to keep current):");
                    String priceStr = sc.nextLine();
                    Integer updateQuantity = quantityStr.isEmpty() ? null : Integer.parseInt(quantityStr);
                    Double updatePrice = priceStr.isEmpty() ? null : Double.parseDouble(priceStr);
                    ims.updateProduct(updateId, updateName.isEmpty() ? null : updateName, updateQuantity, updatePrice);
                    break;

                case 3:
                    System.out.println("Enter Product ID to delete:");
                    int deleteId = sc.nextInt();
                    ims.deleteProduct(deleteId);
                    break;

                case 4:
                    ims.displayInventory();
                    break;

                case 5:
                    System.out.println("Have A Great Day!!!!!!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}