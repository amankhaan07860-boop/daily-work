package Concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.*;

public class ArrayBlockingQueues {
    public static void main(String[] args) {
        BlockingQueue<Integer> ab = new SynchronousQueue<>();

//        ExecutorService ex = Executors.newFixedThreadPool(3);

       Thread t1= new Thread(()->{
            try {
                System.out.println("Putting 1");
                ab.put(1);

                System.out.println("Putting 2");
                ab.put(2);

                System.out.println("Putting 3");
                ab.put(3);

//                ab.put(4); // ❗ yaha block hoga

                System.out.println(ab);
//
//                System.out.println("Added 4");
            } catch (Exception e) {}
        });
               t1.start();
        Thread t2 = new Thread(()->{
            try {

                ab.take();
                ab.take();

//                System.out.println("Putting 2");
//                ab.put(2);
//
//                System.out.println("Putting 3");
//                ab.put(3);
//
////                ab.put(4); // ❗ yaha block hoga
//
//                System.out.println(ab);
////
////                System.out.println("Added 4");
            } catch (Exception e) {}
        });
                t2.start();
    }
}
