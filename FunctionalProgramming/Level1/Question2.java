package FunctionalProgramming.Level1;

import java.util.function.Function;

public class Question2 {
    public static void main(String[] args) {

        Function<String, Integer> getLength = str -> str.length();


        String input = "Sanjana";
        int length = getLength.apply(input);

        System.out.println("Length of \"" + input + "\" is: " + length);
    }
}

