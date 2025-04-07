// CustomUncheckedDemo.java

// Step 1: Create a custom unchecked exception by extending RuntimeException
class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomUncheckedDemo {

    // Step 2: Method that uses the custom unchecked exception
    static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }

    public static void main(String[] args) {
        try {
            validateMarks(120); // Try changing to 85 for valid input
        } catch (InvalidMarksException e) {
            System.out.println("Caught Custom Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
