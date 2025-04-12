package JAVA.WEEKLY ASSINGMENTS;
ign a class which represents an employee. The data members are:
name (string), age (int), grossSalary (double), takeHomeSalary(float), grade (char). Provide 
methods called input() and display() which reads all details of a record from the keyboard and 
displays them respectively. Handle IOException while reading from the keyboard. Provide a 
menu with the options: Input, Display and Exit to read users choice. (Make use of Wrapper 
classes)




import java.io.*;  // For BufferedReader and IOException

class Employee {
    // Data members
    String name;
    int age;
    double grossSalary;
    float takeHomeSalary;
    char grade;

    // Method to input employee details
    public void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter name: ");
            name = br.readLine();

            System.out.print("Enter age: ");
            age = Integer.parseInt(br.readLine()); // Wrapper class used

            System.out.print("Enter gross salary: ");
            grossSalary = Double.parseDouble(br.readLine()); // Wrapper class used

            System.out.print("Enter take home salary: ");
            takeHomeSalary = Float.parseFloat(br.readLine()); // Wrapper class used

            System.out.print("Enter grade (A/B/C): ");
            grade = br.readLine().charAt(0);

        } catch (IOException e) {
            System.out.println("Input error occurred: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e);
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Take Home Salary: " + takeHomeSalary);
        System.out.println("Grade: " + grade);
    }
}

// Main class
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input");
            System.out.println("2. Display");
            System.out.println("3. Exit");

            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        emp.input();
                        break;
                    case 2:
                        emp.display();
                        break;
                    case 3:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } catch (IOException e) {
                System.out.println("Input error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}

