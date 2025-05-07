package FunctionalProgramming.DataProcessiongAndTransforation;
import java.util.*;
import java.util.stream.*;

import java.util.*;
import java.util.stream.*;


public class Question33 {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(2, 4, 6),
                Arrays.asList(3, 4, 6, 8),
                Arrays.asList(10, 11, 2)
        );

        List<Integer> distinctEvenNumbers = numbers.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct even numbers: " + distinctEvenNumbers);
    }
}
