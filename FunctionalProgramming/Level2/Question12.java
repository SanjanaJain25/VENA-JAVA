package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.*;

public class Question12 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Krishna", "Radha", "Sita", "Shiv");


        Optional<String> longest = names.stream()
                .reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);


        longest.ifPresent(s -> System.out.println("Longest string: " + s));
    }
}

