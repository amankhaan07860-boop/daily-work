package Multithreading;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    public static void main(String[] args) {
        Object key = new Object();
        Queue <Integer> queue = new LinkedList<Integer>();
        int size = 5;

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    synchronized (key) {
                        while (queue.size() == size) {
                            try {
                                key.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                            queue.offer(count++);
                            try {
                                Thread.sleep(300);
                                key.notifyAll();
                                System.out.println("Producer size :" + queue.size());
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        });


        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (key) {
                        while (queue.size()==0) {
                            try {
                                key.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        queue.poll();
                        try {
                            Thread.sleep(500);
                            key.notifyAll();
                            System.out.println("Consumed size :"+queue.size());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        });
        producer.start();
        consumer.start();
    }
}