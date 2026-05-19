package ACID;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread ka kaam chal raha hai");
    }
}

public class Test {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("Main thread ka kaam");
    }
}

