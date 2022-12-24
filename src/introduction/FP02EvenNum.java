package introduction;

import java.util.List;

public class FP02EvenNum {

    public static void print(int number) {
        System.out.println(number);
    }
    public static void main(String[] args) {
        printEvenNumbers(List.of(1,2,3,4,5));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        //Using lambda expression
        //numbers.stream().filter(n -> n%2 ==0).forEach(FP02EvenNum::print);
        //Using method reference
        numbers.stream().filter(FP02EvenNum::isEven).forEach(FP02EvenNum::print);
    }
}
