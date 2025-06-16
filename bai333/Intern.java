package bai333;

public class Intern extends Employee {
    private String mentor;

    public Intern(String id, String name, String email, double baseSalary, String mentor) {
        super(id, name, email, baseSalary);
        this.mentor = mentor;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("Intern: " + getName() + ", Mentor: " + mentor + ", Salary: " + calculateSalary());
    }
}
