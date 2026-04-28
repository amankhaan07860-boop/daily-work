package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class ReentrantLocks {
    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    void increment() {
        lock.lock(); // 🔒
        try {
            count++;
        } finally {
            lock.unlock(); // 🔓
        }
    }
}
   class Test {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLocks reentrantLock = new ReentrantLocks();
        ExecutorService ex = Executors.newFixedThreadPool(2);
        Runnable task = () ->{
            for (int i = 0; i < 1000; i++) {
                reentrantLock.increment();
            }
        };
        ex.submit(task);
        ex.submit(task);
        ex.shutdown();
        ex.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("Final count : "+reentrantLock.count);
    }
}
