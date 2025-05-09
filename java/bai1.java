import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số điện");
        int kwh = scanner.nextInt();
        int tien = 0;
        if (kwh <= 50) {
            tien = kwh * 1800;

        } else if (kwh <= 100) {
            tien = 50 * 1800 + (kwh - 50) * 2300;
        } else {
            tien = 50 * 1800 + 50 * 2300 + (kwh - 100) * 3000;

        }
        System.out.println("tổng là" + tien + "VNĐ");

    }

}
