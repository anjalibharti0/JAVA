import java.io.*;

class Employee {
    private String name;
    private int age;
    private double grossSalary;
    private float takeHomeSalary;
    private char grade;

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter name: ");
            name = br.readLine();

            System.out.print("Enter age: ");
            age = Integer.parseInt(br.readLine());

            System.out.print("Enter gross salary: ");
            grossSalary = Double.parseDouble(br.readLine());

            System.out.print("Enter take home salary: ");
            takeHomeSalary = Float.parseFloat(br.readLine());

            System.out.print("Enter grade: ");
            grade = br.readLine().charAt(0);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter the correct data type.");
        }
    }

    public void display() {
        System.out.println("----- Employee Details -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gross Salary: ₹" + grossSalary);
        System.out.println("Take Home Salary: ₹" + takeHomeSalary);
        System.out.println("Grade: " + grade);
    }
}

public class EmployeeMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Employee emp = new Employee();
        int choice;

        while (true) {
            System.out.println("\n--- Employee Menu ---");
            System.out.println("1. Input Employee Details");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        emp.input();
                        break;
                    case 2:
                        emp.display();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
