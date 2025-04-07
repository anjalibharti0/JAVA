class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // Set thread name
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Priority: " + getPriority() + ") -> Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class th { 
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);  // 10

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
