package FunctionalProgramming.Level3;

import java.util.*;
import java.util.stream.*;

public class Question18 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grapes");


        String result = words.stream()
                .collect(Collectors.joining(", "));


        System.out.println("Joined string: " + result);
    }
}

