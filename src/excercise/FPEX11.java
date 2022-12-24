package excercise;

import java.util.List;
import java.util.stream.Collectors;

public class FPEX11 {
    public static void main(String[] args) {

        /**
         * Create a list with lengths of all course titles
         */
        List<String> listOfStrings = List.of(
                "Java",
                "Python",
                "Javascript"
        );

        List<Integer> wordLengthList = listOfStrings
                .stream()
                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println(wordLengthList);

    }
}
