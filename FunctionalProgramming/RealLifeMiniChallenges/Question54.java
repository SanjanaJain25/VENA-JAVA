package FunctionalProgramming.RealLifeMiniChallenges;

import java.util.*;
import java.util.stream.*;

public class Question54 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "apple", "banana", "kiwi", "blueberry", "cherry", "orange", "pineapple"
        );

        // Get top 3 longest strings
        List<String> top3Longest = strings.stream()
                .sorted((str1, str2) -> Integer.compare(str2.length(), str1.length()))  // Sort by length in descending order
                .limit(3)  // Take only the top 3
                .collect(Collectors.toList());

        // Print the top 3 longest strings
        System.out.println("Top 3 longest strings: " + top3Longest);
    }
}

