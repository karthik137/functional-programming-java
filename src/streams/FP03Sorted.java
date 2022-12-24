package streams;

import java.util.List;

/**
 * Program to sort numbers
 */
public class FP03Sorted {

    public static void main(String[] args) {
        List<Integer> numbers =
                List.of(2,3,8,5,9,7);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
