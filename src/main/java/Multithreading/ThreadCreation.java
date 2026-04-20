package Multithreading;

public class ThreadCreation{
    public static void main(String[] args) {
        ThreadCreation2 t1 = new ThreadCreation2();
        Thread t2 = new Thread(t1);
        t2.start();
        Thread t3 = new Thread(t1);
        t3.start();
//        System.out.println("hello");
    }

}


