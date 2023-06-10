
class MyThread extends Thread {
    public void run() {
        int i=0;
        while (i<5) {
            System.out.println("My thread is running");
            System.out.println("I am Happy");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i=0;
        while (i<5) {
            System.out.println("My thread222 is running and good");
            System.out.println("I am sad...! ");
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {

        MyThread mt = new MyThread();
        MyThread2 mt1 = new MyThread2();
        mt.start();
        mt1.start();
    }
}