// this is custom exception
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString(){
        return super.toString()+"i m toString()";
    }
    @Override
    public String getMessage(){
        return super.getMessage()+"i m get message";
    }
}
// public package JAVA.EXCEPTION;

 public class Uncheck2 {
    public static void main(String[] args) {
        int a=8;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
                throw new MyException();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();

            }
        }
    }

    
}
















//not check by compiler at compile time occurs
// at run time example arithematic exception  null pointer  exception
//java.lang.runtimeexception
// ⚠️ Why it’s called Unchecked:
// Error and RuntimeException are unchecked exceptions.

// The compiler doesn't force you to catch them or declare them using throws.

// In your code, you're catching the Error (which is allowed) and printing a message.


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



public class UncheckedExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        try {
            String str = null;
            System.out.println(str.length());  // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
}









