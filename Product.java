public class Product {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String identify() {
        return "I am the Product class. I represent an item sold by the store: " + productName;
    }

    public String showProduct() {
        return "Product available: " + productName;
    }
}