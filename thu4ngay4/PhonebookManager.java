package thu4ngay4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookManager {
    private static HashMap<String, Contact> phonebook = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        do {
            showMenu();
            System.out.print("Chọn chức năng: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ!");
                continue;
            }

            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> searchContact();
                case 5 -> System.out.println("👋 Thoát chương trình. Tạm biệt!");
                default -> System.out.println("⚠️ Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("\n📒 MENU QUẢN LÝ DANH BẠ:");
        System.out.println("1. Thêm liên lạc");
        System.out.println("2. Sửa liên lạc");
        System.out.println("3. Xoá liên lạc");
        System.out.println("4. Tìm kiếm liên lạc");
        System.out.println("5. Thoát");
    }

    private static void addContact() {
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        if (phonebook.containsKey(phone)) {
            System.out.println("⚠️ Số điện thoại đã tồn tại!");
            System.out.print("Bạn có muốn ghi đè? (y/n): ");
            String confirm = scanner.nextLine();
            if (!confirm.equalsIgnoreCase("y"))
                return;
        }

        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        phonebook.put(phone, new Contact(name, email));
        System.out.println("✅ Liên lạc đã được thêm thành công!");
    }

    private static void editContact() {
        System.out.print("Nhập số điện thoại cần sửa: ");
        String phone = scanner.nextLine();

        if (!phonebook.containsKey(phone)) {
            System.out.println("❌ Không tìm thấy số điện thoại trong danh bạ.");
            return;
        }

        Contact contact = phonebook.get(phone);
        System.out.print("Nhập họ tên mới (để trống nếu không thay đổi): ");
        String name = scanner.nextLine();
        if (!name.isEmpty())
            contact.setName(name);

        System.out.print("Nhập email mới (để trống nếu không thay đổi): ");
        String email = scanner.nextLine();
        if (!email.isEmpty())
            contact.setEmail(email);

        System.out.println("✅ Liên lạc đã được cập nhật!");
    }

    private static void deleteContact() {
        System.out.print("Nhập số điện thoại cần xoá: ");
        String phone = scanner.nextLine();

        if (phonebook.remove(phone) != null) {
            System.out.println("✅ Đã xoá liên lạc.");
        } else {
            System.out.println("❌ Không tìm thấy số điện thoại.");
        }
    }

    private static void searchContact() {
        System.out.print("Nhập từ khoá tìm kiếm: ");
        String keyword = scanner.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("🔍 Kết quả tìm kiếm:");
        for (Map.Entry<String, Contact> entry : phonebook.entrySet()) {
            String phone = entry.getKey();
            Contact contact = entry.getValue();
            if (contact.getName().toLowerCase().contains(keyword)
                    || contact.getEmail().toLowerCase().contains(keyword)) {
                System.out.println(phone + " - " + contact);
                found = true;
            }
        }

        if (!found) {
            System.out.println("⚠️ Không tìm thấy liên lạc nào khớp.");
        }
    }
}
