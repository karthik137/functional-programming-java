package excercise;

import java.util.List;

/**
 * Program to print list of courses (String)
 */
public class FPEX2 {

    public static void main(String[] args) {
        printCourses(List.of("Java", "Python", "Javascript"));
    }

    private static void print(String course) {
        System.out.println(course);
    }

    private static void printCourses(List<String> courses) {
        courses.stream().forEach(FPEX2::print);
    }
}
