class A{
    static void show(){
        System.out.println("it is a static method 1");
    }
}
class B{
    static void show(){
        System.out.println("it is a static method 2");
    }
}
public class Staticmodifier {
    public static void main(String[] args) {
        A.show();
        B.show();
        
    }
    
}
