package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.*;

public class Question14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());


        System.out.println("Squares: " + squares);
    }
}
