package excercise;

import java.util.List;

/**
 * Program to cube every number and find sum of cubes
 */
public class FPEX8 {

    public static void main(String[] args) {
        cubeAndSum(List.of(1,2,3));
    }

    private static void cubeAndSum(List<Integer> numbers) {

        int sum = numbers.stream()
                .map(num -> num*num*num)
                .reduce(0, (a,b) -> (a+b));

        System.out.println(sum);
    }
}
