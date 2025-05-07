package FunctionalProgramming.Level4;

import java.util.*;
import java.util.stream.*;

public class Question22 {


    public static Map<String, Integer> wordToLength(List<String> words) {
        return words.stream()
                .collect(Collectors.toMap(word -> word, word -> word.length()));
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grapes");


        Map<String, Integer> wordLengthMap = wordToLength(words);


        System.out.println("Word to Length Map: " + wordLengthMap);
    }
}
