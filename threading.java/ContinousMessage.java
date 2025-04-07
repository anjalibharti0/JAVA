class gm extends Thread {
    public void run() {
        while (true) {
            System.out.println(".(good morning)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class wm extends Thread {
    public void run() {
        while (true) {
            System.out.println("...(welcome)");
            try {
                Thread.sleep(2000); // a bit slower to make output more readable
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ContinousMessage {
    public static void main(String[] args) {
        gm t1 = new gm();
        wm t2 = new wm();

        t1.start();
        t2.start();
    }
}
