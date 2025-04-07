
class A implements Runnable {
    private String name;

    A(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class join2
 {
    public static void main(String[] args) {
        A obj = new A("Thread-1");
        A obj1 = new A("Thread-2");

        Thread t = new Thread(obj);
        Thread t1 = new Thread(obj1);

        try {
            t.start();      // Start Thread-1
            // t.join();       // Wait for Thread-1 to finish

            t1.start();     // Now start Thread-2
            t1.join();  
            t.join();       // Wait for Thread-1 to finish
            // Wait for Thread-2 to finish

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread continues after both threads are done.");
    }
}

