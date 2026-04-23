package Multithreading;

public class StaticSynchronized {
        static synchronized void print() {
            System.out.println(Thread.currentThread().getName() + " start");

            try { Thread.sleep(1000);
            } catch(Exception e) {}

            System.out.println(Thread.currentThread().getName() + " end");
        }
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> StaticSynchronized.print());
        Thread t2 = new Thread(() -> StaticSynchronized.print());

        t1.start();
        t2.start();
    }
    }





