package Concurrency;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureCombine {


        public static void main(String[] args) {

            CompletableFuture<Integer> f1 =
                    CompletableFuture.supplyAsync(() -> 10);

            CompletableFuture<Integer> f2 =
                    CompletableFuture.supplyAsync(() -> 20);

            CompletableFuture<Integer> result =
                    f1.thenCombine(f2, (a, b) -> {
                        return a + b;
                    });

            System.out.println(result.join());
        }
    }

