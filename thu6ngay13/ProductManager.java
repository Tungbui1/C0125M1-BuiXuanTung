package thu6ngay13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> productList;
    private final String filename = "products.dat";

    public ProductManager() {
        productList = readFromFile();
    }

    // Thêm sản phẩm mới
    public void addProduct(Product p) {
        productList.add(p);
        writeToFile();
    }

    // Hiển thị tất cả sản phẩm
    public void displayAll() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
        } else {
            System.out.println("===== Danh sách sản phẩm =====");
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    // Hiển thị sản phẩm có giá >= 200,000
    public void displayPriceOver200k() {
        boolean found = false;
        for (Product p : productList) {
            if (p.getPrice() >= 200000) {
                if (!found) {
                    System.out.println("===== Sản phẩm có giá từ 200,000 VND =====");
                    found = true;
                }
                System.out.println(p);
            }
        }
        if (!found) {
            System.out.println("Không có sản phẩm nào giá từ 200,000 VND.");
        }
    }

    // Cập nhật giá sản phẩm theo ID
    public void updateProductPrice(String id, double newPrice) {
        boolean found = false;
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                p.setPrice(newPrice);
                found = true;
                break;
            }
        }
        if (found) {
            writeToFile();
            System.out.println("Đã cập nhật giá sản phẩm.");
        } else {
            System.out.println("Không tìm thấy sản phẩm với mã: " + id);
        }
    }

    // Ghi file
    private void writeToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(productList);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // Đọc file
    private List<Product> readFromFile() {
        List<Product> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            list = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File chưa có -> trả về list rỗng
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
        return list;
    }
}
