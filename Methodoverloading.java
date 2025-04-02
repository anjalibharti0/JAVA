
class A {
    void add(int x, int y) {
        System.out.println("The value is " + (x + y));
    }

    void add(double x, float y) {
        System.out.println("The value is " + (x + y));
    }

    void add(int x) {
        System.out.println("The value is " + x);
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        A obj = new A();
        obj.add(2, 3);
        A obj2 = new A();
        obj2.add(2.0, 8.9f);
        A obj3 = new A();
        obj3.add(4);
    }
}


