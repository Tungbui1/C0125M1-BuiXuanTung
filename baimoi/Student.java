package baimoi;

import java.util.Scanner;

public class Student {
    private String name;
    private double grade;

    public Student() {
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public void input(Scanner scanner) {
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();

        System.out.print("Nhập điểm: ");
        grade = scanner.nextDouble();
        scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | Điểm: " + grade);
    }

}
