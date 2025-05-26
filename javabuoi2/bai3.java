package javabuoi2;

public class bai3 {
    public static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5.0, 3.0);
            Rectangle rectangle2 = new Rectangle(50.0, 90.0);
            System.out.println("Diện tích: " + rectangle.getArea());
            System.out.println("Chu vi: " + rectangle.getPerimeter());
            System.out.println("Diện tích: " + rectangle2.getArea());
            System.out.println("Chu vi: " + rectangle2.getPerimeter());

        }
    }

}