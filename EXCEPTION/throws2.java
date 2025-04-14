class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can't be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can't be negative";
    }
}

public class Throws2 {

    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException(); // Fixed: use `new` keyword
        }
        return Math.PI * r * r;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0); // This will throw ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            double a = area(-6); // This will throw NegativeRadiusException
            System.out.println(a);
        } catch (NegativeRadiusException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
