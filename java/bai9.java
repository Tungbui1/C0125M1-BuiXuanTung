import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tien USD");
        int tien = scanner.nextInt();
        int tiendoi = tien * 2300;
        System.out.println("Gia tri hien tai cua" + tien + "USD la " + tiendoi + "VND");
    }
}