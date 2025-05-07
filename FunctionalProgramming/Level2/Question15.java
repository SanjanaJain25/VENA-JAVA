package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.*;

public class Question15 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grapes");


        List<Integer> lengths = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());


        System.out.println("Lengths of words: " + lengths);
    }
}
