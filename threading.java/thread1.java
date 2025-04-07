// package threading.java;
class A implements Runnable{
    public void run(){
        System.out.println("the thread is running.........");
    }

}
public class thread1 {
    public static void main(String[] args) {
    A ob=new A();
    A ob2=new A();
    // ob.run();
    // ob2.run();
    Thread t=new Thread(ob);
    Thread t2=new Thread(ob2);
    t.start();
    t2.start();
    // t.join();
    // t2.join();
    }
}
