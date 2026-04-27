package Multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class DeadlockDemo {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Locked lock1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock2) {
                    System.out.println("Thread 1: Locked lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Locked lock2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (lock1) {
                    System.out.println("Thread 2: Locked lock1");
                }
            }
        });

        t1.start();
        t2.start();


        // 🔍 Deadlock detection thread
        new Thread(() -> {
            try {
                Thread.sleep(500); // wait for deadlock to happen
            } catch (Exception   e) {}

            ThreadMXBean bean = ManagementFactory.getThreadMXBean();
            long[] ids = bean.findDeadlockedThreads();

            if (ids != null) {
                System.out.println("\n🚨 Deadlock Detected!");

                ThreadInfo[] infos = bean.getThreadInfo(ids);

                for (ThreadInfo info : infos) {
                    System.out.println("Thread: " + info.getThreadName());
                }
            } else {
                System.out.println("No deadlock");
            }
        }).start();
    }
}