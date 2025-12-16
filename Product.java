import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public abstract static class Product { //Base class for Products
    private String name; //Product name
    private double price; //Product Price
    private String sku; //Stock keeping unit

    public Product(String name, double price, String sku) { // Constructor for Product
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    protected static Locale stream() {
        return null;
    }

    //Getters & Setters for products
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getSku(){
        return sku;
    }
    public void setSku(String sku){
        this.sku = sku;
    }
}
public class Tech extends Product { //Technology products subclass

    private int wattage; //Tech units

    public Tech(String name, double price, String sku) { //Constructor
        super(name, price, sku);
        this.wattage = wattage;
        Tech = Product.stream() // Filter for Products to gather new list
                .filter(p -> p instanceof Tech)
                .collect(toList());
    }

    //Getter & Setter for Wattage
    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public abstract class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public abstract void addProduct(); //Abstract method for adding products
    }

    public class Customer extends User { // Customer subclass
        private List<Product> userCart;

        public Customer(String username, String password) {
            super(username, password);
            this.userCart = new ArrayList<>();
        }

        public void addProduct(Product product) { //Method to add Products to cart
            userCart.add(product);
        }

        public List<Product> getUserCart() {
            return userCart;
        }

        public void setUserCart(List<Product> userCart) {
            this.userCart = userCart;
        }

        public void removeProduct(Product product) { //Method to remove products
            userCart.remove(product);
        }

        public void viewProducts() { //Method to view products
            for (Product product : userCart) {
                System.out.println(product);
            }
        }

        public void clearCart() { //Method to clear user's cart
            userCart = new ArrayList<>();
        }
    }

    public class Order { // Class to handle orders on items

        private Customer customer;
        private Date orderDate;
        private List<Product> items;

        public Order(Customer customer) {
            this.customer = customer;
            this.orderDate = new Date();
            this.items = new ArrayList<>();
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Date getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }

        public List<Product> getItems() {
            return items;
        }

        public void setItems(List<Product> items) {
            this.items = items;
        }

        public void addProduct(Product product) {
            items.add(product);
        }

        public void removeProduct(Product product) {
            items.remove(product);
        }

        public double calcTotal() {
            double total = 0;
            for (Product product : items) {
                double price = product.getPrice();
                total += price;
            }
            return total;
        }
    }

    List<Product> Tech;
}
    double total = total.stream()
            .mapToDouble(Product :: getPrice)
            .sum();

void main() {
    List<Product> searchResults = total
            .filter(p -> p.getName().contains("keyword"));
}






