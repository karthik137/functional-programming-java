package excercise;

import java.util.List;

/**
 * Find the sum of odd numbers
 */
public class FPEX9 {

    public static void main(String[] args) {
        sumOfOdd(List.of(1,2,3,4,5,6));
        
    }

    private static void sumOfOdd(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(num -> num%2 != 0)
                .reduce(0,(a,b) -> (a+b));
        System.out.printf("Sum of odd numbers : "+sum);
    }
}
