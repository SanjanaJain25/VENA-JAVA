package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sita", "Krishna", "Radha", "Aman");


        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());


        System.out.println("Names longer than 4 characters: " + longNames);
    }
}
