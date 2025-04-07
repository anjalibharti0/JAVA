// package threading.java;
// public class Synchoronization {
// }

// Shared resource class
class Counter {
    int count = 0;

    // Synchronized method ensures only one thread can access it at a time
    public synchronized void increment() {
        count++;
    }

    // Try commenting out 'synchronized' and see how the final output changes!
}

// Thread class that operates on the shared Counter
class MyThread extends Thread {
    Counter counter; // shared resource

    // Constructor to pass the shared Counter
    MyThread(Counter counter) {
        this.counter = counter;
    }

    // Thread's job: increment the counter 1000 times
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Synchoronization {
    public static void main(String[] args) throws InterruptedException {
        // Create one Counter object shared by both threads
        Counter c = new Counter();

        // Create two threads that both use the same Counter
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish before checking the result
        t1.join();
        t2.join();

        // Print the final count value
        System.out.println("Final Count (Expected 2000): " + c.count);
    }
}
