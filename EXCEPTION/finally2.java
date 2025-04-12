public class finally2
 {
    public static void main(String[] args) {
        System.out.println("Opening a file...");

        try {
            System.out.println("Reading file content...");
            
            // Simulating an exception
            int result = 10 / 0;

            System.out.println("This line won't execute due to exception.");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
            return; // Even with return, finally will still execute
        } finally {
            // This block will always execute
            System.out.println("Closing the file... (finally block)");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}
