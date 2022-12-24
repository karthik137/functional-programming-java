package excercise;

import java.util.List;

/**
 * Print cube of numbers
 */
public class FPEX5 {

    public static void main(String[] args) {
        printCube(List.of(1,2,3,4,5,6));
    }

    private static void printCube(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }
}
