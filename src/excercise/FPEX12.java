package excercise;

import java.util.List;

public class FPEX12 {


    public static Integer intSum(int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5);

        //Find functional interface behind the second argument of reduce method.
        //Create an implementation for the Functional interface.

        Integer sum = numbers
                .stream()
                .reduce(FPEX12::intSum).get();

        System.out.println(sum);
    }

}
