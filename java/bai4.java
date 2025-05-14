import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float dientich = width * height;
        System.out.println("dien tich " + dientich);
    }

}
