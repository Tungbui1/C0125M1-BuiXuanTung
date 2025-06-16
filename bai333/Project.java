package bai333;

import java.util.*;

public class Project {
    private String projectId;
    private String projectName;
    private List<Employee> members;

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.members = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        members.add(e);
    }

    public void displayProjectInfo() {
        System.out.println("Project: " + projectName + " (ID: " + projectId + ")");
        for (Employee e : members) {
            e.displayInfo();
        }
    }
}
