package javabuoi2;

public class bai2 {
    public static class Student {
        private String name;
        private int age;
        private String grade;

        public Student(String name, int age, String grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public void displayinfo() {
            System.out.println("Ten" + name);
            System.out.println("tuoi" + age);
            System.out.println("lop" + grade);
        }

        public static void main(String[] args) {
            Student student = new Student("Tung", 22, "c2");
            Student student2 = new Student("Trần Thị B", 21, "CNTT2");
            student.displayinfo();
            student2.displayinfo();
        }
    }

}
