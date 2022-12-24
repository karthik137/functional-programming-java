package Paralelization;

import java.util.stream.LongStream;

public class FP01Parallel {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        System.out.println(LongStream.range(0,1000000000)
                .parallel().sum());
        System.out.println(System.currentTimeMillis() - time);

    }
}
