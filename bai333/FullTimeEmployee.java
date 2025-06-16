package bai333;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String id, String name, String email, double baseSalary, double bonus) {
        super(id, name, email, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Full-Time Employee: " + getName() + ", Salary: " + calculateSalary());
    }
}
