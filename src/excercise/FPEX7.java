package excercise;


import java.util.List;

/**
 * Square every number in the list and find sum of squares
 */
public class FPEX7 {

    public static void main(String[] args) {
        squareAndSum(List.of(1,2,3,4,5));
    }

    private static void squareAndSum(List<Integer> numbers) {

        int sumOfSquares = numbers.stream()
                .map(x -> x*x)
                .reduce(0,(x,y) -> (x+y));

        System.out.printf("Sum of squares "+sumOfSquares);
        
    }


}
