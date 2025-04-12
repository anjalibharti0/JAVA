// package EXCEPTION;

// public class Multiple2 {
    
// }
public class Multiple2 {
    public static void main(String[] args) {

        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        try {
            int[] nums = new int[2];
            nums[3] = 100; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        System.out.println("Program continues after all exceptions.");
    }
}
