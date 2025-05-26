package bai222;

public class InstallmentProduct extends PhysicalProduct implements InstallmentSupport {
    private int months;

    public InstallmentProduct(String name, double basePrice, double shippingFee, int months) {
        super(name, basePrice, shippingFee);
        this.months = months;
    }

    @Override
    public int getInstallmentMonths() {
        return months;
    }

    public double getMonthlyPaymentAmount() {
        return getMonthlyPayment(getFinalPrice());
    }
}
