package excercise;

import java.util.List;

/**
 * Program to print only odd numbers from the list
 */
public class FPEX1 {
    public static void main(String[] args) {
        printOddNumbers(List.of(1,2,3,4,5,6,8,9,7));
    }

    private static void print(int number){
        System.out.println(number);
    }

    private static void printOddNumbers(List<Integer> numbers) {
        //Using lambda and method reference approach
        numbers.stream().filter(n -> n%2 !=0).forEach(FPEX1::print);
    }
}
