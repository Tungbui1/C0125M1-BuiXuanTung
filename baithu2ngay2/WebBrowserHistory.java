package baithu2ngay2;

import java.util.*;

public class WebBrowserHistory {
    private static Stack<String> backStack = new Stack<>();
    private static Stack<String> forwardStack = new Stack<>();
    private static String currentPage = "Trang chủ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== TRÌNH DUYỆT WEB =====");
            System.out.println("📄 Trang hiện tại: " + currentPage);
            System.out.println("1. Truy cập trang mới");
            System.out.println("2. Quay lại (Back)");
            System.out.println("3. Tiến tới (Forward)");
            System.out.println("4. Thoát");
            System.out.print("👉 Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("🔗 Nhập URL trang mới: ");
                    String newPage = scanner.nextLine();
                    backStack.push(currentPage);
                    forwardStack.clear();
                    currentPage = newPage;
                    System.out.println("➡️ Đã chuyển đến: " + currentPage);
                    break;

                case 2:
                    if (backStack.isEmpty()) {
                        System.out.println("⚠️ Không thể quay lại!");
                    } else {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("⬅️ Quay lại: " + currentPage);
                    }
                    break;

                case 3:
                    if (forwardStack.isEmpty()) {
                        System.out.println("⚠️ Không thể tiến tới!");
                    } else {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("➡️ Tiến tới: " + currentPage);
                    }
                    break;

                case 4:
                    System.out.println("👋 Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("❌ Lựa chọn không hợp lệ!");
            }
        }
    }
}
