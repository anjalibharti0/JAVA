class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class join {
    public static void main(String[] args) {
        A obj = new A();
        Thread t = new Thread(obj);
        t.start();
        try {
            t.join(); // Main thread waits for t to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread continues after t is done.");
    }
}
