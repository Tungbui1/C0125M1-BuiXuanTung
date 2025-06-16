package thu6ngay13;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ProductManager {
    private static final String FILE_NAME = "products.txt";
    private static final String LOG_FILE = "history.log";
    private List<Product> productList = new ArrayList<>();

    public ProductManager() {
        loadFromFile();
    }

    private void writeLog(String action, String data) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true)) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            fw.write("[" + time + "] " + action + ": " + data + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        productList.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    productList.add(new Product(parts[0], parts[1], Double.parseDouble(parts[2])));
                }
            }
        } catch (IOException e) {
            System.out.println("Không tìm thấy file sản phẩm.");
        }
    }

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Product p : productList) {
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        backupFile();
    }

    private void backupFile() {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        String backupName = "products_backup_" + time + ".txt";
        try {
            Files.copy(Paths.get(FILE_NAME), Paths.get(backupName), StandardCopyOption.REPLACE_EXISTING);
            writeLog("Backup", backupName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showAll() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách trống.");
        } else {
            for (Product p : productList)
                p.display();
        }
    }

    public void addProduct(Product p) {
        productList.add(p);
        saveToFile();
        writeLog("Added", p.toString());
    }

    public void filterByPrice(double minPrice) {
        for (Product p : productList) {
            if (p.getPrice() >= minPrice)
                p.display();
        }
    }

    public void updatePrice(String id, double newPrice) {
        for (Product p : productList) {
            if (p.getId().equals(id)) {
                p.setPrice(newPrice);
                saveToFile();
                writeLog("Updated price", id + " -> " + newPrice);
                System.out.println("Đã cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy mã sản phẩm.");
    }

    public void searchByNameInFile(String keyword) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println("Tìm thấy: " + line);
                    found = true;
                }
            }
            if (!found)
                System.out.println("Không tìm thấy.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteById(String id) {
        boolean removed = productList.removeIf(p -> p.getId().equals(id));
        if (removed) {
            saveToFile();
            writeLog("Removed", id);
            System.out.println("Đã xóa sản phẩm.");
        } else {
            System.out.println("Không tìm thấy mã sản phẩm.");
        }
    }

    public void importFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    productList.add(new Product(parts[0], parts[1], Double.parseDouble(parts[2])));
                    count++;
                }
            }
            saveToFile();
            writeLog("Imported", "from " + fileName);
            System.out.println("Đã nhập " + count + " sản phẩm.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
