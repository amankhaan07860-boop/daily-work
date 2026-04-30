package Concurrency;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureSupplyAsync {
     public static void main(String[] args) throws InterruptedException {

            CompletableFuture<Integer> future =
                    CompletableFuture.supplyAsync(() -> {
                        System.out.println("Task running...");
                        return 10 + 20;
                    });

            future.thenAccept(result -> {

                System.out.println("Result: " + result);
            });

            System.out.println("Main thread free...");

            future.join();
        }
    }

