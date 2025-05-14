import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int so = scanner.nextInt();
        int soDaoNguoc = 0;
        if (so > 0) {
            while (so != 0) {
                int chuSo = so % 10;
                soDaoNguoc = soDaoNguoc * 10 + chuSo;
                so /= 10;
            }

            System.out.println("Số đảo ngược là: " + soDaoNguoc);
        } else {
            System.out.println("vui lòng nhập lại");

        }
    }

}
