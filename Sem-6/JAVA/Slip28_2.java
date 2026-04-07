class MyThread4 extends Thread {

    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread().getName());
    }
}

public class Slip28_2 {
    public static void main(String[] args) {

        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();

        t1.start();
        t2.start();
    }
}