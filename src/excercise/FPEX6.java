package excercise;

import java.util.List;

/**
 * Program to print number of characters in a course
 */
public class FPEX6 {

    public static void main(String[] args) {
        printCharsInCourse(List.of("Java", "Python"));
    }

    private static void printCharsInCourse(List<String> courses) {
        courses.stream().map(
                c -> c.length()
        ).forEach(System.out::println);
    }
}
