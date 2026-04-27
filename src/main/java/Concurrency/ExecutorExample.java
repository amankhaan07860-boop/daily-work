package Concurrency;
import java.util.concurrent.*;

public class ExecutorExample implements Runnable {
    private final int id;

            ExecutorExample(int id){
            this.id = id;
            }
    @Override
    public void run() {
        System.out.println("Task "+id+" executed by "+Thread.currentThread().getName());
    }
}
  class main {
     public static void main(String[] args) {
         ExecutorService executorService = Executors.newCachedThreadPool();
         for (int i = 0; i <=5; i++) {
             executorService.submit(new ExecutorExample(i));
         }
          executorService.shutdown();
         }
     }
