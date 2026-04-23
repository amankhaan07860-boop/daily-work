package Multithreading;

public class ThreadPriority extends Thread{
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        System.out.println(currentThread().getName());
        t1.start();
        t2.start();
        t1.setPriority(4);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

    }
}
