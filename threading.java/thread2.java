// pacage threading.java; 
class A implements Runnable{
   public void run(){
        System.out.println(Thread.currentThread()+"java thread");
    }
}
public class thread2 {
    public static void main(String[] args) {
        A obj=new A();
        A obj2=new A();
        Thread t1= new Thread(obj);
        Thread t2=new Thread(obj2);
        t1.getPriority();
        t2.getPriority();
        t1.start();
        t2.start();
    }
}