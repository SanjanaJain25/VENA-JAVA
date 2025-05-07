package FunctionalProgramming.Level4;

import java.util.function.Function;

public class Question23 {
    public static void main(String[] args) {

        Function<String, String> toUpperCase = str -> str.toUpperCase();


        Function<String, String> appendExclamation = str -> str + "!";


        Function<String, String> upperCaseThenExclamation = toUpperCase.andThen(appendExclamation);


        String result = upperCaseThenExclamation.apply("hey");
        String results = upperCaseThenExclamation.apply("Sanjana");



        System.out.println(result);
        System.out.println(results);
    }
}
