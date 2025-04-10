// package EXCEPTION;
// Custom Checked Exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method demonstrating a checked exception
    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {

        // 1. Try-Catch for ArithmeticException (Unchecked Exception)
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. Try-Catch with Multiple Catch Blocks
        try {
            String str = null;
            System.out.println(str.length()); // causes NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 3. Try-Finally Block (without catch)
        try {
            System.out.println("Inside try-finally block.");
        } finally {
            System.out.println("Finally block always executes.");
        }

        // 4. Custom Checked Exception Handling
        try {
            checkAge(16); // Throws AgeException
        } catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // 5. Unchecked Exception Example
        try {
            int[] arr = new int[3];
            arr[5] = 100; // causes ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after all exception handling.");
    }
}
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckedExceptionWithoutFile {

    // Method that throws a checked exception
    public static void printDate(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(dateStr); // throws ParseException
        System.out.println("Parsed date: " + date);
    }

    public static void main(String[] args) {
        // Example 1: ParseException (Checked)
        try {
            printDate("31-02-2023"); // Invalid date (Feb doesn't have 31)
        } catch (ParseException e) {
            System.out.println("Caught ParseException: " + e.getMessage());
        }

        // Example 2: InterruptedException (Checked)
        try {
            System.out.println("Sleeping for 2 seconds...");
            Thread.sleep(2000); // throws InterruptedException
            System.out.println("Awake now!");
        } catch (InterruptedException e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        }

        System.out.println("Program finished.");
    }
}
