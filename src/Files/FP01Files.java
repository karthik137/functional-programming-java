package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP01Files {
    public static void main(String[] args) throws IOException {
        //Read the content of the file
        Files.lines(Paths.get("testfile.txt"))
                .map(str -> str.split(" "))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

    }
}
