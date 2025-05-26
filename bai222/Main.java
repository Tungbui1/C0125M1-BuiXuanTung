package bai222;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new PhysicalProduct("Áo sơ mi", 500000, 30000));
        products.add(new DigitalProduct("E-book Java", 200000));
        products.add(new DiscountedProduct("Ti vi", 8000000, 100000, 0.1));
        products.add(new InstallmentProduct("Điện thoại", 12000000, 50000, 12));

        for (Product p : products) {
            System.out.println("Tên: " + p.getName());
            System.out.println("Giá gốc: " + p.getBasePrice());
            System.out.println("Phí vận chuyển: " + p.getShippingFee());
            System.out.println("Giá sau vận chuyển: " + p.getFinalPrice());

            if (p instanceof Discountable) {
                Discountable d = (Discountable) p;
                System.out.println("Chiết khấu: " + (d.getDiscountRate() * 100) + "%");
                System.out.println("Giá sau giảm: " + d.getPriceAfterDiscount(p.getFinalPrice()));
            }

            if (p instanceof InstallmentSupport) {
                InstallmentSupport i = (InstallmentSupport) p;
                System.out.println("Trả góp: " + i.getInstallmentMonths() + " tháng");
                System.out.println("Trả mỗi tháng: " + i.getMonthlyPayment(p.getFinalPrice()));
            }

            System.out.println("----------------------");
        }
    }
}
