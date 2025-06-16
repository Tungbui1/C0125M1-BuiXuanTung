package mung6thang6;

import java.util.Scanner;

public class IncreasingSubstringChecker {
    public static boolean isIncreasingSubString(String str) {
        if (str.length() <= 1) {
            return true;
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) <= str.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        if (isIncreasingSubString(input)) {
            System.out.println("Chuỗi là chuỗi con tăng dần liên tiếp.");
        } else {
            System.out.println("Chuỗi không phải là chuỗi con tăng dần liên tiếp.");
        }

        scanner.close();
    }
}
