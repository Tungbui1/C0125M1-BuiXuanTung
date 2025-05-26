package bai222;

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double getShippingFee() {
        return 0.0;
    }
}
