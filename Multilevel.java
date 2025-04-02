
class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



class Manager extends Employee {
    String department;

    Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayManager() {
        super.displayEmployee();
        System.out.println("Department: " + department);
    }
}



class ProjectManager extends Manager {
    String projectName;

    ProjectManager(String name, int age, String department, String projectName) {
        super(name, age, department);
        this.projectName = projectName;
    }

    void displayProjectManager() {
        super.displayManager();
        System.out.println("Project Name: " + projectName);
    }
}
public class Multilevel {
    public static void main(String[] args) {
        ProjectManager projectManager = new ProjectManager("John Doe", 35, "IT", "AI Project");
        projectManager.displayProjectManager();
    }
}


