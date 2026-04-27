package Concurrency;
import java.util.concurrent.*;

public class Callables {
        // Callable class
//        static class MyTask implements Callable<Integer> {
//
//            @Override
//            public Integer call() throws Exception {
////                Thread.sleep(2000); // simulate work
//                return 10 + 20;
//            }
//        }

        public static void main(String[] args) throws Exception {

            ExecutorService ex = Executors.newSingleThreadExecutor();

            // object create
            Callable<Integer> task = () ->{
                return 10+20;
            };

            // submit → Future milega
            Future<Integer> future = ex.submit(task);


            System.out.println("Task submit ho gaya...");

            // result lene ke liye
            int result = future.get(); // blocking

            System.out.println("Result: " + result);

            ex.shutdown();
        }

}
