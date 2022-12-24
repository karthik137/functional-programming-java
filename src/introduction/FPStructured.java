package introduction;

import java.util.List;

public class FPStructured {
    public static void main(String[] args) {
        printAllNumbersInList(List.of(1,2,3,4,5,5,6,7,8));
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        for(var number : numbers) {
            System.out.println(number);
        }
    }
}
