package excercise;

import java.util.List;

/**
 * Print courses which has atleast 4 letters
 */
public class FPEX4 {

    public static void main(String[] args) {
        printCourses(List.of("Java", "Javascript", "Python","C#"));
    }

    public static boolean hasMinLength(String course) {
        return course.length() >= 4;
    }
    public static void print(String course) {
        System.out.println(course);
    }
    private static void printCourses(List<String> courses) {

        courses.stream().filter(FPEX4::hasMinLength)
                .forEach(FPEX4::print);
    }
}
