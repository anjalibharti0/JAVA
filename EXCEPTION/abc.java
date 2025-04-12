// package JAVA.EXCEPTION;

public class abc {
    public static void main(String[] args) {
        int[] a = new int[5];
        
        // Print array elements
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]+"+"+i);
        }

        // Handle ArrayIndexOutOfBoundsException
        try {
            System.out.println(a[6]);  // Out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle ArithmeticException
        try {
            int c = 5;
            int i = 0;
            int d = c / i;
            System.out.println("Result: " + d);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e);
        }

        // Handle Compile-Time type error (shown as comment)
        // int a = "sita"; //  This is a compile-time error and must be corrected before compilation
        // You can't assign a String to an int variable

        // Corrected version:
        String name = "sita";
        System.out.println("Name: " + name);
    }
}
