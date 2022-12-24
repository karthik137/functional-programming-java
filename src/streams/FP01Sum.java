package streams;

import java.util.List;

public class FP01Sum {

    public static void main(String[] args) {
        calculateSum(List.of(1,2,3,4,5));
    }

    public static int sum(int a,int b){
        //System.out.println(a + " "+ b);
        return a+b;
    }

    private static void calculateSum(List<Integer> numbers) {

        //Reduce will always return a single result
        int sum = numbers.stream()
                .reduce(0,FP01Sum::sum);
        System.out.println(sum);

    }
}
