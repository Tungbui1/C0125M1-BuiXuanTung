package bai222;

public interface Discountable {
    double getDiscountRate();

    default double getPriceAfterDiscount(double price) {
        return price * (1 - getDiscountRate());
    }
}
