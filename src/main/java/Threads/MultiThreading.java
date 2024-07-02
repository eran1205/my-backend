package Threads;

public class MultiThreading {
    public static void main(String[] args) {
        MultiThreadThread thread1 = new MultiThreadThread(1);
        MultiThreadThread thread2 = new MultiThreadThread(2);
        MultiThreadRunnable thread3 = new MultiThreadRunnable(3);

        thread1.start();
        thread2.start();

        Thread myThread = new Thread(thread3);
        myThread.start();
        try {
            System.out.println("isAlive thread1: " + thread1.isAlive());
            thread1.join();
            thread2.join();
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("isAlive thread1: " + thread1.isAlive());
        System.out.println("Finish running");
    }
}
