package streams;

import java.util.List;

/**
 * Program to demonstrate distinct operation on streams
 */
public class FP02Distinct {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,3,4,6,7,7);

        /**
         * Distinct will remove duplicates
         */
        numbers.stream()
                .distinct().forEach(
                        System.out::println
                );
    }
}
