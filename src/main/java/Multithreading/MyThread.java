package Multithreading;

public class MyThread extends Thread{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("Thread Name 1:"+ Thread.currentThread().getName() );

        MyThread t2 = new MyThread();
        t2.start();
        System.out.println(t2.getState());
    }

    @Override
    public void run() {
        System.out.println("hello");
    }
}
