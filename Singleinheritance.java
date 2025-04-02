import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Employee {
    String name;
    int age;
    double salary;

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}


public class Singleinheritance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name: ");
        String name = br.readLine();

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter department: ");
        String department = br.readLine();

        Manager manager = new Manager(name, age, salary, department);
        manager.display();
    }
}


