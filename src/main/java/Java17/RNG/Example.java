package Java17.RNG;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Example {
    public static void main(String[] args) {
        RandomGenerator random = RandomGeneratorFactory.of("L64X128MixRandom")
                .create();{
        }
        System.out.println(random.nextInt(10000000));
    }
}