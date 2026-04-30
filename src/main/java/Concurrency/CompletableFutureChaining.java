package Concurrency;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureChaining {
     public static void main(String[] args) {

            CompletableFuture.supplyAsync(() -> {
                        System.out.println("Step 1");
                        return 10;
                    })
                    .thenApply(x -> {
                        System.out.println("Step 2");
                        return x * 2;
                    })
                    .thenApply(x -> {
                        System.out.println("Step 3");
                        return x + 5;
                    })
                    .thenAccept(result -> {
                        System.out.println("Final Result: " + result);
                    })
                    .join();
        }
    }

