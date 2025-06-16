package thu2;

public class Student {
    private String name;
    private int id;
    private static int nextId = 1000;

    public Student(String name) {
        this.name = name;
        this.id = nextId++;
    }

    public void display() {
        System.out.println("Tên: " + name + ", ID: " + id);
    }

    // Demo
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.display();
        s2.display();
    }
}
