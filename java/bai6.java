import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang");
        int month = scanner.nextInt();
        System.out.println("Nhap Nam");
        int year = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + "có 30 ngày.");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Tháng 2 năm " + year + "có 29 ngày (năm nhuận)");
                } else {
                    System.out.println("Tháng 2 năm " + year + " có 28 ngày");
                }
                break;
            default:
                System.err.println("Tháng không hợp lệ!");
        }
    }
}
