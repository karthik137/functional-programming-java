package functional_interfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FP03BiPC {

    public static void main(String[] args) {

        // Use this when you have two inputs to your predicate and output is boolean
        BiPredicate<Integer, String> biPredicate
                = (number, str) -> {
            return number < 10 && str.length() > 5;
        };

        System.out.println(biPredicate.test(20,"HelloWorld"));

        // Can return any type as output
        BiFunction<Integer, String, Boolean> biFunction
                = (number, str) -> {
            return number < 10 && str.length() > 5;
        };

        System.out.println(biFunction.apply(20,"HelloWorld"));

        BiConsumer<String, String> biConsumer = (s1,s2) -> {
            System.out.println(s1+s2);
        };
        biConsumer.accept("Hey","World");

    }
}
