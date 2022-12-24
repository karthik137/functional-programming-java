package excercise;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Program to demonstrate behaviour parametrization
 */
public class FPEX13 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);

        Function<Integer, Integer> mappingFunction = x -> x * x;

        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, mappingFunction);

        System.out.println(squaredNumbers);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction).collect(Collectors.toList());
    }

    private static Function<Integer, Integer> getIntegerIntegerFunction() {
        return x -> x * x;
    }

    private static Function<Integer, Integer> mappingFunction() {
        return x -> x * x;
    }
}
