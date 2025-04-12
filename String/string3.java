class Demo23{
    int x;
public class string3 {
    public static void main(String[] args) {
        Demo23 ob = new Demo23("java");
        ob.x=100;
        Demo23 ob1 = new Demo23("java"); 
        ob1.x=100;

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
}