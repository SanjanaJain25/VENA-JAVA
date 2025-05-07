package FunctionalProgramming.Level3;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class Question16 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sita", "Ram", "Radha", "Shyam", "Geeta", "Gopal");


        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));


        groupedByFirstLetter.forEach((letter, group) ->
                System.out.println(letter + " => " + group));
    }
}
