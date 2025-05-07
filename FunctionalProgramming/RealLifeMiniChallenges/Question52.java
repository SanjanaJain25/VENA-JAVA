package FunctionalProgramming.RealLifeMiniChallenges;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Question52 {


    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(predicate)  // Apply the filter
                .peek(item -> System.out.println("Filtered item: " + item))  // Log each filtered item
                .collect(Collectors.toList());  // Collect and return the result as a list
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = filterAndLog(numbers, isEven);

        System.out.println("Filtered even numbers: " + evenNumbers);
    }
}

