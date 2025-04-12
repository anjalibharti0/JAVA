public class Runtime {
    public static void main(String[] args) {
        int a = 80;
        int b = 5;
        int c = 9;

        try {
            int x = a / (b - c);
            System.out.println("x = " + x);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred in x: " + e);
        }

        try {
            int y = a / (b + c);
            System.out.println("y = " + y);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred in y: " + e);
        }
    }
}
