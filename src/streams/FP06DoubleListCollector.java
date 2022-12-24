package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FP06DoubleListCollector {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);

        //This will collect the sequare of numbers to a new list
        List<Integer> doubledList = numbers.stream()
                .map(num -> num* num * num)
                .collect(Collectors.toList());

        System.out.println(doubledList.toString());
    }
}
