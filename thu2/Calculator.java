package thu2;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Lỗi: Không thể chia cho 0");
            return Double.NaN;
        }
        return (double) a / b;
    }

    // Demo
    public static void main(String[] args) {
        System.out.println("5 + 3 = " + Calculator.add(5, 3));
        System.out.println("5 - 3 = " + Calculator.subtract(5, 3));
        System.out.println("5 * 3 = " + Calculator.multiply(5, 3));
        System.out.println("5 / 0 = " + Calculator.divide(5, 0)); // lỗi
    }
}
