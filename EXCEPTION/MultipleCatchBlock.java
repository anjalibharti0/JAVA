// package EXCEPTION;

// public class MultipleCatchBlock {
    
// }
public class MultiCatchExample1 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[5] = 30; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}

