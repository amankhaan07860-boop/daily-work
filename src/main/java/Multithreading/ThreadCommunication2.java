package Multithreading;

public class ThreadCommunication2 {
    public static void main(String[] args) {
        ThreadCommunication te = new ThreadCommunication();
        te.start();
        System.out.println(te.total);
       synchronized (te) {
            try {
                System.out.println(te.total);
                te.wait();
                System.out.println(te.total);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(te.total);
        }
    }
}

