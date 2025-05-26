package bai222;

public interface InstallmentSupport {
    int getInstallmentMonths();

    default double getMonthlyPayment(double totalPrice) {
        return totalPrice / getInstallmentMonths();
    }
}
