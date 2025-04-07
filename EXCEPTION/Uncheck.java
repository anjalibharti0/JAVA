// package EXCEPTION;
class demo28 {
    void show() {
        try {
            throw new Error(); // 'Error' is an unchecked exception
        } catch (Error e) {
            System.out.println("Java programming");
        }
    }
}
public class Uncheck {
    public static void main(String[] args) {
        demo28 obj = new demo28();
        obj.show();
    }
}








