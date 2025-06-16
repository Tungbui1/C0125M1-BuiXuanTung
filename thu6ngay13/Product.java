package thu6ngay13;

public class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + price;
    }

    public void display() {
        System.out.printf("Mã: %s | Tên: %s | Giá: %.0f VND%n", id, name, price);
    }
}
