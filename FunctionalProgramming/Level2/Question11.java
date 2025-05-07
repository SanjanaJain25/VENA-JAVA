package FunctionalProgramming.Level2;

import java.util.*;
import java.util.stream.*;

public class Question11 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sita", "Ram", "Shyam", "Geeta", "Sunil");


        long count = names.stream()
                .filter(name -> name.startsWith("S"))
                .count();

        System.out.println("Number of names starting with 'S': " + count);
    }
}
