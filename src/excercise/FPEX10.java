package excercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Program to collect even numbers to a new list
 */
public class FPEX10 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);

        List<Integer> evenNumberList = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());

        System.out.printf(evenNumberList.toString());
    }
}
