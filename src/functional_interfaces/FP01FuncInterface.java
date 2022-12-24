package functional_interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP01FuncInterface {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        // Takes One input and returns a boolean
        // Used in filter
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        // Takes an input and returns an output
        //Used in map
        Function<Integer, Integer> squareFunction = x-> x * x;

        // Consumes whatever it takes and does not return anything
        // Used in forEach
        Consumer<Integer> sysoutConsumer = System.out::println;


        Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };



    }
}
