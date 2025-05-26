package bai222;

public class DiscountedProduct extends PhysicalProduct implements Discountable {
    private double discountRate;

    public DiscountedProduct(String name, double basePrice, double shippingFee, double discountRate) {
        super(name, basePrice, shippingFee);
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    public double getFinalPriceAfterDiscount() {
        return getPriceAfterDiscount(getFinalPrice());
    }
}
