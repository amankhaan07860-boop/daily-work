package Multithreading;

public class ThreadCreation2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"Number : "+ i);
        }
    }
}
