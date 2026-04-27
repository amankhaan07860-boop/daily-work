package Concurrency;

import java.util.concurrent.ConcurrentLinkedQueue;

public class NonBlockingQueue {
    public static void main(String[] args) {
            ConcurrentLinkedQueue<Integer> nb = new ConcurrentLinkedQueue<>();
            nb.add(1);
            System.out.println("Removing : "+nb.poll());
            System.out.println(nb.poll());
            nb.add(3);
        System.out.println(nb);
        }
    }
