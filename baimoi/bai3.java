package baimoi;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        System.out.println("🔰 Nhập thông tin 10 sinh viên:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Sinh viên thứ " + (i + 1) + ":");
            students[i] = new Student();
            students[i].input(scanner);
        }
        System.out.println("\n📌 Danh sách sinh viên có điểm > 8.0:");
        for (Student s : students) {
            if (s.getGrade() > 8.0) {
                s.displayInfo();
            }
        }
        int yeu = 0, trungBinh = 0, khaGioi = 0;

        for (Student s : students) {
            double g = s.getGrade();
            if (g < 5)
                yeu++;
            else if (g <= 7)
                trungBinh++;
            else
                khaGioi++;
        }

        // In kết quả
        System.out.println("\n📊 Kết quả phân loại:");
        System.out.println("Yếu: " + yeu + " sinh viên");
        System.out.println("Trung bình: " + trungBinh + " sinh viên");
        System.out.println("Khá/Giỏi: " + khaGioi + " sinh viên");

        scanner.close();
    }
}
