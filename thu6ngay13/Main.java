package thu6ngay13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm mới");
            System.out.println("3. Hiển thị sản phẩm có giá từ 200.000 trở lên");
            System.out.println("4. Cập nhật giá sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("==========================");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    pm.displayAll();
                    break;
                case 2:
                    System.out.print("Nhập mã SP: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên SP: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá SP: ");
                    double price = Double.parseDouble(sc.nextLine());
                    pm.addProduct(new Product(id, name, price));
                    break;
                case 3:
                    pm.displayPriceOver200k();
                    break;
                case 4:
                    System.out.print("Nhập mã SP cần cập nhật giá: ");
                    String updateId = sc.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    pm.updateProductPrice(updateId, newPrice);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
