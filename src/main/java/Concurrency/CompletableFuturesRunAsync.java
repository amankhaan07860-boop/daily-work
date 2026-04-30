package Concurrency;
import java.util.concurrent.*;

public class CompletableFuturesRunAsync {
        public static void main(String[] args) throws InterruptedException {

            CompletableFuture.runAsync(() -> {
                System.out.println("Task running in background...");
            });
            Thread.sleep(1000);
            System.out.println("Main thread free...");
        }

}
