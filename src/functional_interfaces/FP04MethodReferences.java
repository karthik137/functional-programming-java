package functional_interfaces;

import java.util.List;
import java.util.function.Supplier;

public class FP04MethodReferences  {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> courses = List.of("String", "Spring"
        , "API", "Spring Boot");

        courses.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        // With method reference
        courses.stream()
                .map(str -> str.toUpperCase())
                .forEach(System.out::println);


        // With method reference, custom defined
//        courses.stream()
//                .map(str -> str.toUpperCase())
//                .forEach(FP04MethodReferences::printMessage);

        //Without calling the method using . operator on the object
        courses.stream()
                .map(String::toUpperCase)
                .forEach(FP04MethodReferences::printMessage);


        //You can also use it for constructor refernce

//        Supplier<String> supplier = () -> new String();
        Supplier<String> supplier = String::new;


    }
}
