package JAVA.WEEKLY ASSINGMENTS;
// import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Patient {
    String name;
    int age;
    int hospitalNumber;

    // Constructor
    public Patient() {
        hospitalNumber = (int)(Math.random() * 10000 + 1000); // auto-generated hospital number
    }

    // Input method
    public void input(BufferedReader br) throws IOException {
        System.out.print("Enter patient name: ");
        name = br.readLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(br.readLine());
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hospital Number: " + hospitalNumber);
    }
}

// Inpatient class extends Patient
class Inpatient extends Patient {
    String department;
    String roomType;
    LocalDate admissionDate;

    // Constructor
    public Inpatient() {
        super(); // calls Patient class constructor
    }

    // Input method
    public void input(BufferedReader br) throws IOException {
        super.input(br); // call Patient's input method

        System.out.print("Enter department: ");
        department = br.readLine();

        System.out.print("Enter room type (Special/SemiSpecial/General): ");
        roomType = br.readLine();

        System.out.print("Enter admission date (dd-MM-yyyy): ");
        String dateStr = br.readLine();
        admissionDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // Display method
    public void display() {
        super.display(); // call Patient's display method
        System.out.println("Department: " + department);
        System.out.println("Room Type: " + roomType);
        System.out.println("Admission Date: " + admissionDate);
    }
}

// Billing class extends Inpatient
class Billing extends Inpatient {
    LocalDate dischargeDate;

    // Constructor
    public Billing() {
        super(); // calls Inpatient constructor
    }

    // Input method
    public void input(BufferedReader br) throws IOException {
        super.input(br); // call Inpatient's input method

        System.out.print("Enter discharge date (dd-MM-yyyy): ");
        String ddate = br.readLine();
        dischargeDate = LocalDate.parse(ddate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // Calculate and display bill
    public void calculateBill() {
        long days = ChronoUnit.DAYS.between(admissionDate, dischargeDate);
        if (days == 0) days = 1; // At least 1 day charge

        double consultCharge = 0, roomRent = 0;

        switch (roomType.toLowerCase()) {
            case "special":
                consultCharge = 1000;
                roomRent = 200;
                break;
            case "semispecial":
                consultCharge = 500;
                roomRent = 100;
                break;
            case "general":
                consultCharge = 100;
                roomRent = 50;
                break;
            default:
                System.out.println("Invalid room type!");
                return;
        }

        double total = (consultCharge + roomRent) * days;

        System.out.println("Discharge Date: " + dischargeDate);
        System.out.println("Days Admitted: " + days);
        System.out.println("Total Amount to Pay: Rs. " + total);
    }
}

// Main class to test everything
public class HospitalBillingSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Billing bill = new Billing();

        System.out.println("=== Patient Admission Details ===");
        bill.input(br);

        System.out.println("\n=== Displaying Patient Info ===");
        bill.display();

        System.out.println("\n=== Billing Info ===");
        bill.calculateBill();
    }
}
