package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.*;

public class Question13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);


        List<Integer> sortedDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println("Sorted in descending order: " + sortedDesc);
    }
}

