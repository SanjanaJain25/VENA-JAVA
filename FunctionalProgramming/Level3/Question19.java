package FunctionalProgramming.Level3;

import java.util.*;
import java.util.stream.*;

public class Question19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 6, 8, 10, 15, 20);


        Optional<Integer> firstDivisibleByFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .findFirst();


        firstDivisibleByFive.ifPresent(n -> System.out.println("First divisible by 5: " + n));
    }
}

