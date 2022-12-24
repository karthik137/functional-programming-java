package streams;

import java.util.Comparator;
import java.util.List;

public class FP05Comparator {

    public static void main(String[] args) {
        List<String> listOfString = List.of("Java","Python","Spring","Docker");

        listOfString.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
