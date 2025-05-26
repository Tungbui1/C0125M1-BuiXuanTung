package bai111;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new FullTimeEmployee("Nguyen Van A", 15000000);
        employees[1] = new PartTimeEmployee("Tran Thi B", 80, 100000);
        employees[2] = new Intern("Le Van C", 3000000);
        employees[3] = new PartTimeEmployee("Pham Thi D", 60, 90000);
        employees[4] = new FullTimeEmployee("Hoang Van E", 18000000);

        double totalSalary = 0;

        for (Employee e : employees) {
            System.out.println("Name: " + e.getName());
            System.out.println("Type: " + e.getType());
            System.out.println("Salary: " + e.calculateSalary() + " VND");

            if (e instanceof Intern) {
                ((Intern) e).attendTraining();
            }

            if (e instanceof PartTimeEmployee) {
                System.out.println("Hours Worked: " + ((PartTimeEmployee) e).getHoursWorked());
            }

            System.out.println("----------------------");
            totalSalary += e.calculateSalary();
        }

        System.out.println("Tổng lương công ty phải trả: " + totalSalary + " VND");
    }
}
