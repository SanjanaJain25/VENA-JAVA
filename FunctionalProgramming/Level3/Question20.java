package FunctionalProgramming.Level3;

import java.util.*;

public class Question20 {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Sanjana");


        Optional<String> emptyName = Optional.empty();


        String result1 = name.orElse("Default Name");
        String result2 = emptyName.orElse("Default Name");


        System.out.println("Result with value: " + result1);  // Alice
        System.out.println("Result with default: " + result2); // Default Name
    }
}
