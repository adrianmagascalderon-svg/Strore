public class Store {

    public String storeName;
    public Product product;     // Composition
    public Customer customer;   // Aggregation

    public Store(String storeName, String productName, Customer customer) {
        this.storeName = storeName;
        this.product = new Product(productName); // Store creates Product
        this.customer = customer;                // Customer passed in
    }

    public String identify() {
        return "I am the Store class. I manage store operations for " + storeName;
    }

    public String manageStore() {
        return "Store " + storeName + " is managing inventory and customers.";
    }

    public String getDetails() {
        return identify() + "\n"
             + product.identify() + "\n"
             + product.showProduct() + "\n"
             + customer.identify() + "\n"
             + customer.placeOrder();
    }
}