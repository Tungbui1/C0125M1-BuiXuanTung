package bai333;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Project p1 = new Project("P001", "Website Development");
        Project p2 = new Project("P002", "Mobile App");
        Employee e1 = new FullTimeEmployee("E01", "Tung", "tung@example.com", 1000, 300);
        Employee e2 = new Intern("E02", "An", "an@example.com", 500, "Tung");
        Employee e3 = new Contractor("E03", "Minh", "minh@example.com", 120, 10);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        p1.addEmployee(e1);
        p1.addEmployee(e2);
        p2.addEmployee(e3);
        System.out.println("=== Employee List ===");
        for (Employee e : employees) {
            e.displayInfo();
        }
        System.out.println("\n=== Project List ===");
        p1.displayProjectInfo();
        p2.displayProjectInfo();
    }
}
