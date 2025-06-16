package thu6;

import java.util.*;

class Customer {
    private int number;
    private String name;

    public Customer(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "STT " + number + " - " + name;
    }
}

class Counter {
    private int id;
    private Customer currentCustomer;

    public Counter(int id) {
        this.id = id;
    }

    public boolean isBusy() {
        return currentCustomer != null;
    }

    public void serve(Customer customer) {
        this.currentCustomer = customer;
    }

    public void finishServing() {
        this.currentCustomer = null;
    }

    public String getStatus() {
        return isBusy() ? "Bận (Phục vụ: " + currentCustomer + ")" : "Rảnh";
    }

    public int getId() {
        return id;
    }
}

public class CustomerServiceSystem {
    private static LinkedList<Customer> queue = new LinkedList<>();
    private static List<Counter> counters = new ArrayList<>();
    private static int customerNumber = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            counters.add(new Counter(i));
        }
        for (int i = 0; i < 5; i++) {
            Customer customer = new Customer(customerNumber++, "Khách " + (customerNumber - 1));
            counters.get(i).serve(customer);
        }

        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Thêm 10 khách hàng mới");
            System.out.println("2. Quầy xử lý xong → gọi khách tiếp theo");
            System.out.println("3. Hiển thị hàng đợi hiện tại");
            System.out.println("4. Hiển thị trạng thái các quầy");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        Customer customer = new Customer(customerNumber++, "Khách " + (customerNumber - 1));
                        queue.add(customer);
                    }
                    System.out.println("Đã thêm 10 khách hàng vào hàng đợi.");
                    break;
                case 2:
                    for (Counter counter : counters) {
                        if (counter.isBusy()) {
                            counter.finishServing();
                        }
                        if (!queue.isEmpty()) {
                            Customer next = queue.poll();
                            counter.serve(next);
                            System.out.println("Quầy " + counter.getId() + " gọi " + next);
                        } else {
                            System.out.println("Quầy " + counter.getId() + " không có khách để phục vụ.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("📋 Hàng đợi hiện tại:");
                    if (queue.isEmpty()) {
                        System.out.println("(Trống)");
                    } else {
                        for (Customer c : queue) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 4:
                    System.out.println("🖥 Trạng thái các quầy:");
                    for (Counter c : counters) {
                        System.out.println("Quầy " + c.getId() + ": " + c.getStatus());
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
