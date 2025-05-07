package FunctionalProgramming.Level3;

import java.util.*;
import java.util.stream.*;

public class Question21 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);


        Set<Integer> numberSet = numbers.stream()
                .collect(Collectors.toSet());


        System.out.println("Set: " + numberSet);
    }
}

