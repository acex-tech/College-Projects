import java.util.Random;
class MyThreadw extends Thread {
    int sleepTime;

    // Constructor to set thread name
    MyThreadw(String name) {
        super(name);
    }

    public void run() {
        try {
            Random r = new Random();

            // Generate random sleep time (0–4999 ms)
            sleepTime = r.nextInt(5000);

            System.out.println("Thread " + getName() + " created.");

            System.out.println("Thread " + getName() + " sleeping for " + sleepTime + " ms");

            // Sleep state
            Thread.sleep(sleepTime);

            // Dead state (after run completes)
            System.out.println("Thread " + getName() + " finished (Dead state).");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Slip13_2 {
    public static void main(String[] args) {

        // Create threads with hardcoded names
        MyThreadw t1 = new MyThreadw("Thread-1");
        MyThreadw t2 = new MyThreadw("Thread-2");
        MyThreadw t3 = new MyThreadw("Thread-3");

        // Start threads (moves to runnable state)
        t1.start();
        t2.start();
        t3.start();
    }
}