
// import java.util.Scanner;

// public class bai12 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Nhập một số nguyên: ");
//         int number = scanner.nextInt();

//         if (kiemTraDoiXung(number)) {
//             System.out.println(number + " là số đối xứng.");
//         } else {
//             System.out.println(number + " không phải là số đối xứng.");
//         }
//     }

//     public static boolean kiemTraDoiXung(int n) {
//         int original = n;
//         int reversed = 0;

//         while (n > 0) {
//             int digit = n % 10;
//             reversed = reversed * 10 + digit;
//             n /= 10;
//         }

//         return original == reversed;
//     }
// }
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        int maxDigit = timChuSoLonNhat(number);
        System.out.println("Chữ số lớn nhất là: " + maxDigit);
    }

    public static int timChuSoLonNhat(int n) {
        int max = 0;

        while (n > 0) {
            int digit = n % 10; // Lấy chữ số cuối
            if (digit > max) {
                max = digit;
            }
            n /= 10; // Bỏ chữ số cuối
        }

        return max;
    }
}
// import java.util.Scanner;

// public class bai12 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Nhập số nguyên dương N: ");
// int n = scanner.nextInt();

// long ketQua = tinhGiaiThua(n);
// System.out.println(n + "! = " + ketQua);
// }

// public static long tinhGiaiThua(int n) {
// long giaiThua = 1;
// for (int i = 1; i <= n; i++) {
// giaiThua *= i;
// }
// return giaiThua;
// }
// }
// import java.util.Scanner;

// public class bai12 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// System.out.print("Nhập một số nguyên dương: ");
// int n = scanner.nextInt();

// if (kiemTraSoHoanHao(n)) {
// System.out.println(n + " là số hoàn hảo.");
// } else {
// System.out.println(n + " không phải là số hoàn hảo.");
// }
// }

// public static boolean kiemTraSoHoanHao(int n) {
// if (n <= 1) return false;

// int tongUoc = 0;
// for (int i = 1; i <= n / 2; i++) {
// if (n % i == 0) {
// tongUoc += i;
// }
// }

// return tongUoc == n;
// }
// }
