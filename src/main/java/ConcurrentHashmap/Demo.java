package ConcurrentHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    static Map<Integer, String> map = new HashMap<>();
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
             {
                map.put(1,"A");
            }
        });

        Thread t2 = new Thread(() -> {
             {
                map.put(17,"B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size: " + map.size());
    }

}
