import java.util.Scanner;

public class bai10 {
 public static void main(String[] args) {
     static String[] ones = {
        "", "one", "two", "three", "four", "five",
        "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if (number == 0) return "zero";

        String result = "";

        if (number >= 100) {
            result += ones[number / 100] + " hundred";
            number = number % 100;
            if (number > 0) result += " and ";
        }

        if (number >= 20) {
            result += tens[number / 10];
            if (number % 10 > 0) result += " " + ones[number % 10];
        } else if (number > 0) {
            result += ones[number];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên từ 0 đến 999: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Chỉ hỗ trợ số từ 0 đến 999.");
        } else {
            String text = convert(number);
            System.out.println("Kết quả: " + text);
        }
 }  
}
}
