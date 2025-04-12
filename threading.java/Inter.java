class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " started.");

        try {
            System.out.println(Thread.currentThread().getName() + " going to sleep.");
            Thread.sleep(4000); // Sleep for 4 seconds
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted during sleep.");
        }

        Thread.yield(); // Yield control to other threads
        System.out.println(Thread.currentThread().getName() + " finished.");
    }
}

public class Inter {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();

        Thread thread1 = new Thread(r, "Thread-1");
        Thread thread2 = new Thread(r, "Thread-2");

        thread1.start();
        thread2.start();

        // Give threads a moment to start and go to sleep
        try {
            Thread.sleep(1000); // Wait 1 second before interrupting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt both threads
        // thread1.interrupt();
        // thread2.interrupt();
    }
}
