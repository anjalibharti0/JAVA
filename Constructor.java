class A {
    int x, y;

    A() {
        x = 10;
        y = 0;
    }

    A(int x1, int x2) {
        x = x1;
        y = x2;
    }

    A(A ob) {
        this.x = ob.x;
        this.y = ob.y;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class Constructor {
    public static void main(String args[]) {
        A obj = new A();
        A obj1 = new A(2, 3);
        A obj3 = new A(obj1); // Pass obj1 to the constructor

        obj.display();
        obj1.display();
        obj3.display();
    }
 }