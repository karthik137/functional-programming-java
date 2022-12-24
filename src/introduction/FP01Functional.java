package introduction;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInFunctionalApproach(List.of(1,2,3,4,5,6));
    }

    public static void print(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInFunctionalApproach(List<Integer> numbers) {
//        numbers.stream().forEach( number -> {
//            System.out.print(number);
//        });

        //Method Reference Approach
        numbers.stream().forEach(FP01Functional::print);
    }
}
