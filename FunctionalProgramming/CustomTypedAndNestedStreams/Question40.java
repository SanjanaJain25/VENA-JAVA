package FunctionalProgramming.CustomTypedAndNestedStreams;

import java.util.*;
import java.util.stream.*;

public class Question40 {
    public static void main(String[] args) {
        String csv = "1,2,3,4";

        List<Integer> numbers = Arrays.stream(csv.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("List of integers: " + numbers);
    }
}
