import java.util.Scanner;

public class Customer { 
    public String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String identify() {
        return "I am the Customer class. I represent a buyer named " + customerName;
    }

    public String placeOrder() {
        return customerName + " is placing an order.";
    }
}


