package ConcurrentHashmap;

import Concurrency.ExecutorExample;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(()->{
            for (int i = 0; i < 1000; i++) {
                map.put(i, i);
            }
        });

        ex.submit(()->{
            for (int i = 10000; i < 2000; i++) {
                map.put(i, i);
            }
        });

        ex.shutdown();


        System.out.println(map.size());
    }
}
