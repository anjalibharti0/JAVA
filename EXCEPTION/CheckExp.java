// eg :   file not found we should declared 
// this exception checked by complier at complie time
//java.lang.exception
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
