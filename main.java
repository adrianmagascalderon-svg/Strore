public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Juan");
        Store store = new Store("Tech Store", "Laptop", customer);

        System.out.println(store.getDetails());
    }
}