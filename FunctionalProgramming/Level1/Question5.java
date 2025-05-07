package FunctionalProgramming.Level1;

import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sita", "Ram", "Geeta", "Aman");


        names.sort((s1, s2) -> s1.compareTo(s2));


        System.out.println("Sorted names: " + names);
    }
}

