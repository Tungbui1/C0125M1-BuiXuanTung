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
            System.out.println("5. Tìm kiếm sản phẩm theo tên (file)");
            System.out.println("6. Xóa sản phẩm theo mã");
            System.out.println("7. Nhập sản phẩm từ file khác");
            System.out.println("0. Thoát");
            System.out.println("==========================");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> pm.showAll();
                case 2 -> {
                    System.out.print("Nhập mã: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập giá: ");
                    double price = Double.parseDouble(sc.nextLine());
                    pm.addProduct(new Product(id, name, price));
                }
                case 3 -> pm.filterByPrice(200000);
                case 4 -> {
                    System.out.print("Nhập mã cần cập nhật: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double price = Double.parseDouble(sc.nextLine());
                    pm.updatePrice(id, price);
                }
                case 5 -> {
                    System.out.print("Nhập từ khóa: ");
                    String keyword = sc.nextLine();
                    pm.searchByNameInFile(keyword);
                }
                case 6 -> {
                    System.out.print("Nhập mã cần xóa: ");
                    String id = sc.nextLine();
                    pm.deleteById(id);
                }
                case 7 -> {
                    System.out.print("Nhập tên file cần nhập: ");
                    String fileName = sc.nextLine();
                    pm.importFromFile(fileName);
                }
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}
