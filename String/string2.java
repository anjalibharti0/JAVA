public class string2 {
    public static void main(String[] args) {
        String ob = new String("java");
        String ob1 = new String("java"); 

        // Comparing contents
        if (ob.equals(ob1)) {
            System.out.println("we are same (using equals)");
        }

        // Comparing references
        if (ob == ob1) {
            System.out.println("we are same (using ==)");
        } else {
            System.out.println("we are different (using ==)");
        }

        // Print hash codes
        System.out.println("ob.hashCode(): " + ob.hashCode());
        System.out.println("ob1.hashCode(): " + ob1.hashCode());

        // Print identity hash codes (real memory address-based hashes)
        System.out.println("System.identityHashCode(ob): " + System.identityHashCode(ob));
        System.out.println("System.identityHashCode(ob1): " + System.identityHashCode(ob1));
    }
}
