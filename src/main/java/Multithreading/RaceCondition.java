package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RaceCondition{
    int balance = 1000;
    Lock lock = new ReentrantLock();

    void withdraw(int amount) {
        lock.lock();
         try {
             if (balance >= amount) {
                 System.out.println(Thread.currentThread().getName() + " withdrawing...");
                 balance = balance - amount;
                 System.out.println("remaining balance :" + balance);
             }
         } finally {
             lock.unlock();
         }
//        synchronized(this){
//        if (balance >= amount) {
//            System.out.println(Thread.currentThread().getName() + " withdrawing...");
//            balance = balance - amount;
//            System.out.println("remaining balance :"+balance);
//        }
    }
}
