// dsign a class which represents an inpatient. Every inpatient record is made up of the following fields:
// i. name (String)
// ii. age (integer)
// iii. hospital number (integer)
// iv. Date of admission (class called Date form java.util) OR (user defined separate inner 
// class)
// v. Room rent (double)
// Test the class by writing suitable main method.
// a) Provide default, copy constructor and parameterized constructors to this class. Make suitable 
// change in main to incorporate these changes and test the same.
// b) The hospital number is incremented as obtained from a static variable.
// c) Make suitable change and run the program.
// d) Also provide methods to input a record, to display it, to determine if the date of admission is 
// the todays date. Display suitable message by demonstrating the above class by making suitable 
// change in main.
// e) Create an array of inpatient records and store a minimum of 3 records in it. Assign the data to 
// each of the fields through assignment statement (using constructors) and Display all of them. 
// (No change with respect to class defined earlier. Only change main method)
// f) Check if two patients have the same information except for hospital number. Also determine 
// the number of records who are admitted today.
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Inpatient {
    // static variable to give unique hospital numbers
    static int hospitalCounter = 1000;

    String name;
    int age;
    int hospitalNumber;
    LocalDate dateOfAdmission;
    double roomRent;

    // Default constructor
    Inpatient() {
        hospitalNumber = ++hospitalCounter;
        dateOfAdmission = LocalDate.now(); // by default, today’s date
    }

    // Method to take input using BufferedReader
    void input(BufferedReader br) throws IOException {
        System.out.print("Enter name: ");
        name = br.readLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(br.readLine());

        System.out.print("Enter room rent: ");
        roomRent = Double.parseDouble(br.readLine());

        System.out.print("Enter date of admission (dd-MM-yyyy): ");
        String dateStr = br.readLine();
        dateOfAdmission = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    // Method to display patient details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hospital Number: " + hospitalNumber);
        System.out.println("Date of Admission: " + dateOfAdmission);
        System.out.println("Room Rent: " + roomRent);

        // Check if admitted today
        if (dateOfAdmission.equals(LocalDate.now())) {
            System.out.println("Admitted Today ✅");
        } else {
            System.out.println("Not Admitted Today ❌");
        }
    }

    // Check if two patients have same data (except hospital number)
    boolean isSame(Inpatient other) {
        return name.equals(other.name) &&
               age == other.age &&
               roomRent == other.roomRent &&
               dateOfAdmission.equals(other.dateOfAdmission);
    }
}

public class SimpleHospital {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Inpatient[] patients = new Inpatient[3];

        // Input 3 patient records
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of patient " + (i + 1));
            patients[i] = new Inpatient();  // create new patient
            patients[i].input(br);          // take input
        }

        int todayCount = 0;

        // Display all patient details
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Patient " + (i + 1) + " Info ---");
            patients[i].display();

            if (patients[i].dateOfAdmission.equals(LocalDate.now())) {
                todayCount++;
            }
        }

        // Check if patient 1 and 3 have same details (except hospital number)
        if (patients[0].isSame(patients[2])) {
            System.out.println("\nPatient 1 and 3 have same data (except hospital number)");
        }

        // Show how many admitted today
        System.out.println("\nTotal admitted today: " + todayCount);
    }
}
