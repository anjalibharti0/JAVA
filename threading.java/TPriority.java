class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName()+ " - Count: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("LowPriorityThread");
        MyThread t2 = new MyThread("HighPriorityThread");
        MyThread t3 = new MyThread("NormalPriorityThread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.MAX_PRIORITY);   // 10
        t3.setPriority(Thread.NORM_PRIORITY);  // 5

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
