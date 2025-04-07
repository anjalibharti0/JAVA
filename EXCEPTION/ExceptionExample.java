public class ExceptionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }

        System.out.println("Program continues...");
    }
}
