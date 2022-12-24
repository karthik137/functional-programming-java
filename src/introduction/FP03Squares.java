package introduction;

import java.util.List;

/**
 * Program to print squares of all numbers
 */
public class FP03Squares {

    public static void main(String[] args) {
        printSquares(List.of(1,2,3,4,5));
    }

    private static void printSquares(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
