package Multithreading;

public class ThreadLifecycle extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);        }

    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifecycle t1 = new ThreadLifecycle();
        System.out.println(t1.getState());

        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(500);

        System.out.println(t1.getState());
        t1.join(2000);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());



    }
}
