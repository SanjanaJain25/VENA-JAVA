package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "sita", "geeta", "aman");


        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());


        System.out.println("Uppercase names: " + upperNames);
    }
}
