package Multithreading;

import java.sql.SQLOutput;

public class   ThreadLifeCycleDemo extends  Thread{
    @Override
    public void run() {
        System.out.println("inside run() thread is alive or not :"+this.isAlive());
        int num =0 ;
        while(num<4){
            num++;
            System.out.println("num :"+num);
            try {
                sleep(500);
                System.out.println("I m not in runnable stage Thread is alive or not :"+this.isAlive());
            } catch (InterruptedException e) {
                System.err.println("Thread Interrupted");
            }

        }
    }

    public static void main(String[] args) {
       Thread myThread = new ThreadLifeCycleDemo();

        System.out.println("Before Runnable stage Thread is alive or not :"+myThread.isAlive());
        myThread.start();
        try {
            myThread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println("Thread Interrupted");
        }
        myThread.stop();
        System.out.println("After complete execution of thread, it is alive or not :"+myThread.isAlive());
    }
}
