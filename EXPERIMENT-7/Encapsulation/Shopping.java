class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        }
    }

    public double calculateTotalPrice() {
        return price * quantity;
    }
}

public class Shopping {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 800, 2);
        System.out.println("Product: " + product1.getProductName() + " | Total Price: $" + product1.calculateTotalPrice());

        product1.addStock(3);
        System.out.println("Updated Quantity: " + product1.getQuantity());
        System.out.println("New Total Price: $" + product1.calculateTotalPrice());
    }
}
