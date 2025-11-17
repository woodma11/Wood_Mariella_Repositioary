interface Sales {
    double getPrice();
    String getName();
    double getDiscountedPrice();
}

class Shirt implements Sales {
    private String name;
    private double price;

    public Shirt(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public double getDiscountedPrice() {
        return price * 0.90;
    }
}

class Pants implements Sales {
    private String name;
    private double price;

    public Pants(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public double getDiscountedPrice() {
        return price * 0.80;
    }
}

public class ClothingStore {
    static void main(String[] args) {
        Sales s1 = new Shirt("Stylish Burgundy Blouse", 25.00);
        Sales s2 = new Pants("Black Denim Jeans", 50.00);

        printSaleInfo(s1);
        printSaleInfo(s2);
    }

 public static void printSaleInfo(Sales item) {
        System.out.println("Item: " + item.getName());
        System.out.println("Original Price: $" + item.getPrice());
        System.out.println("Discounted Price: $" + item.getDiscountedPrice());
    }
}

