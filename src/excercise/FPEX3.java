package excercise;

import java.util.List;

/**
 * Print courses containing word Spring
 */
public class FPEX3 {
    public static void main(String[] args) {
        printCourses(List.of("Java", "Spring", "Spring boot", "Javascript"));
    }

    public static boolean containsSubString(String course) {
        return course.contains("Spring");
    }

    public static void print(String course) {
        System.out.println(course);
    }
    private static void printCourses(List<String> courses) {

        courses.stream().filter(FPEX3::containsSubString).forEach(FPEX3::print);
    }
}
