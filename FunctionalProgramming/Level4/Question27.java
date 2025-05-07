package FunctionalProgramming.Level4;

import java.util.*;
import java.util.stream.*;

public class Question27 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "grapes");


        OptionalDouble averageLength = words.stream()
                .mapToInt(String::length)
                .average();


        if (averageLength.isPresent()) {
            System.out.println("Average string length: " + averageLength.getAsDouble());
        } else {
            System.out.println("List is empty.");
        }
    }
}
