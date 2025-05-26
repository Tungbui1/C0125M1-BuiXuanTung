package bai222;

public class PhysicalProduct extends Product {
    protected double shippingFee;

    public PhysicalProduct(String name, double basePrice, double shippingFee) {
        super(name, basePrice);
        this.shippingFee = shippingFee;
    }

    @Override
    public double getShippingFee() {
        return shippingFee;
    }
}
