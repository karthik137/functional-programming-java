package functional_interfaces;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP02Supplier {

    public static void main(String[] args) {

        //No input but return an output
        Supplier<Integer> randomIntegers =  () ->2;

        Supplier<Integer> randomWithMultipleLines = () -> {
            return 2;
        };

        System.out.println(randomIntegers.get());

        //Unary Operator
        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;

        System.out.println(unaryOperator.apply(4));

        //Takes two inputs and returns on output
        BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;


    }
}
