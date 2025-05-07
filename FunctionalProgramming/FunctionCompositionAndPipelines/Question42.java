package FunctionalProgramming.FunctionCompositionAndPipelines;

import java.util.function.Function;

public class Question42 {
    public static void main(String[] args) {

        Function<String, Integer> parseInt = Integer::parseInt;


        Function<Integer, Integer> doubleIt = x -> x * 2;


        Function<String, Integer> parseAndDouble = parseInt.andThen(doubleIt);


        String input = "21";
        int result = parseAndDouble.apply(input);

        System.out.println("Input: " + input);
        System.out.println("Doubled value: " + result);
    }
}

