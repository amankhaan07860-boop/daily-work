package Multithreading;

public class RaceCondition2 {
    public static void main(String[] args) {
        RaceCondition acc = new RaceCondition();
        Thread t1 = new Thread(()-> acc.withdraw(500),"user 1");

        Thread t2 = new Thread(()-> acc.withdraw(500),"user 2");
        t1.start();
        t2.start();
    }
}
