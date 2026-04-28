package Concurrency;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

class Resource {

    ReentrantLock lock = new ReentrantLock();

    void use(String name) {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " got the lock");


                Thread.sleep(2000);

                System.out.println(name + " finished work");
            } catch (Exception e) {
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " skipped (lock busy)");
        }
    }
}

public class ReentrantTryLock {
    public static void main(String[] args) {

        Resource r = new Resource();

        ExecutorService ex = Executors.newFixedThreadPool(2);

        ex.submit(() -> r.use("T1"));
        ex.submit(() -> r.use("T2"));

        ex.shutdown();
    }
}