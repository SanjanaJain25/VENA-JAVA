package FunctionalProgramming.Level4;

import java.util.*;
import java.util.stream.*;

public class Question26 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");


        List<String> result = words.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        System.out.println("Unique sorted words: " + result);
    }
}

