package FunctionalProgramming.Level4;

import java.util.*;
import java.util.stream.*;

public class Question28 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7);


        int product = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of even numbers: " + product);
    }
}

