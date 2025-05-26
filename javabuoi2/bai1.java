package javabuoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int svtoida = 100;
        double[] diem = new double[svtoida];
        System.out.println("Nhập số sinh viên ");
        int sosinhvien = scanner.nextInt();
        if (sosinhvien < 1 || sosinhvien > svtoida) {
            System.out.println("Số lượng sinh viên không hợp lệ!");
            return;
        }
        for (int i = 0; i < sosinhvien; i++) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }
        System.out.println("\nDanh sách điểm đã nhập:");
        for (int i = 0; i < sosinhvien; i++) {
            System.out.println("Sinh viên " + (i + 1) + ": " + diem[i]);
        }
        double sum = 0;
        int countPass = 0;
        double max = diem[0];
        double min = diem[0];
        for (int i = 0; i < sosinhvien; i++) {
            sum += diem[i];
            if (diem[i] >= 5) {
                countPass++;
            }
            if (diem[i] > max) {
                max = diem[i];
            }
            if (diem[i] < min) {
                min = diem[i];
            }
        }
        double average = sum / sosinhvien;
        System.out.println("\n=== Thống kê kết quả ===");
        System.out.println("Điểm trung bình: " + average);
        System.out.println("Số lượng sinh viên đạt (>= 5): " + countPass);
        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
        System.out.println("\n=== Phân loại học lực của sinh viên ===");

        for (int i = 0; i < sosinhvien; i++) {
            String hocLuc;
            if (diem[i] >= 8.0) {
                hocLuc = "Giỏi";
            } else if (diem[i] >= 6.5) {
                hocLuc = "Khá";
            } else if (diem[i] >= 5.0) {
                hocLuc = "Trung bình";
            } else {
                hocLuc = "Yếu";
            }

            System.out.println("Sinh viên " + (i + 1) + ": " + diem[i] + " điểm - " + hocLuc);
        }
        System.out.print("\nNhập một điểm bất kỳ để kiểm tra: ");
        double diemCanTim = scanner.nextDouble();
        boolean timThay = false;
        System.out.println("Vị trí xuất hiện của điểm " + diemCanTim + ":");
        for (int i = 0; i < sosinhvien; i++) {
            if (diem[i] != diemCanTim) {
                continue;
            }
            System.out.println(" - Tại chỉ số " + i + " (Sinh viên thứ " + (i + 1) + ")");
            timThay = true;
        }
        if (!timThay) {
            System.out.println("Không tìm thấy điểm này trong danh sách.");
        }

    }

}
