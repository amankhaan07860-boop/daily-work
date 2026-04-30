package Concurrency;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureCallbackTypes {

        public static void main(String[] args) {

            CompletableFuture.supplyAsync(() -> {
                        System.out.println("Start");
                        return 10;
                    })
                    .thenApply(x -> {
                        System.out.println("thenApply: " + x);
                        return x * 2;
                    })
                    .thenAccept(x -> {
                        System.out.println("thenAccept: " + x);
                    })
                    .thenRun(() -> {
                        System.out.println("thenRun: Done");
                    })
                    .join();
        }
    }

