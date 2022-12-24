package CustomClasses;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
    private String name;
    private String category;

    private int reviewScore;
    private int noOfStudents;


    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

public class FP01CustomClass {

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring"
                ,"Framework",98,20000),
                new Course("FullStack"
                        ,"Framework",91,10000),
                new Course("JQuery"
                        ,"Library",98,4000),
                new Course("NodeJS"
                        ,"Language",98,3000),
                new Course("Reactjs"
                        ,"Library",90,22000),
                new Course("RESTAPI"
                        ,"framework",80,33000)
        );

        Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90 = course -> course.getReviewScore() < 90;
        Predicate<Course> anyScoreGreaterThan90 = course -> course.getReviewScore() > 95;


        System.out.println(courses.stream()
                .allMatch(reviewScoreGreaterThan95));

        //None match

        System.out.println(courses.stream()
                .noneMatch(reviewScoreLessThan90));

        //Any match
        //Even if any one matches the predicate it would return true
        System.out.println(courses.stream()
                .anyMatch(reviewScoreGreaterThan95));

        //Sorting courses with sorted and creating comparators

        Comparator comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);

        List<Course> sortedCourses = (List<Course>) courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList());

        System.out.println(sortedCourses);

        //Sort the thing by decreasing number of students

        Comparator comparingByNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();

        List<Course> sortedCoursesDecr = (List<Course>) courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList());

        System.out.println(sortedCoursesDecr);


        Comparator comparingByNoOfStudentsAndNoOFReviews = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore)
                .reversed();

        List<Course> sortedCoursesAndRev = (List<Course>) courses.stream().sorted(comparingByNoOfStudentsAndNoOFReviews).collect(Collectors.toList());


        System.out.println(sortedCoursesAndRev);

        List<Course> sortedCoursesAndRevAndSkip = (List<Course>) courses.stream().sorted(comparingByNoOfStudentsAndNoOFReviews)
                .skip(2).collect(Collectors.toList());

        System.out.println(sortedCoursesAndRevAndSkip);

        //Using skip and limit

        List<Course> sortedCoursesAndRevAndSkipAndLimit = (List<Course>) courses.stream().sorted(comparingByNoOfStudentsAndNoOFReviews)
                .skip(2)
                .limit(2).collect(Collectors.toList());

        System.out.println(sortedCoursesAndRevAndSkipAndLimit);

        /**
         * Which is the top course when we are comparing
         */
        System.out.println(courses.stream()
                .max(comparingByNoOfStudentsAndNoOFReviews)
                .stream().collect(Collectors.toList()));


        // Get total number of students where course review is greater than 95

        System.out.println(courses.stream()
                .filter(reviewScoreGreaterThan95)
                .mapToInt(course -> course.getNoOfStudents())
                .sum());

        //Grouping courses

        //Group by category
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory)));

        //Group by but print count not data
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

        //Group by categories and return highest review course

        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        //Groupd by and display only names
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName,Collectors.toList()))));




    }
}
