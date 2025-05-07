package FunctionalProgramming.RealLifeMiniChallenges;

import java.util.*;
import java.util.stream.*;

public class Question51 {
    public static void main(String[] args) {
        String paragraph = "This is a test. This test is simple. Simple test, very simple.";


        String cleanedParagraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();


        List<String> words = Arrays.asList(cleanedParagraph.split("\\s+"));


        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));


        wordFrequency.forEach((word, count) ->
                System.out.println(word + ": " + count)
        );
    }
}

