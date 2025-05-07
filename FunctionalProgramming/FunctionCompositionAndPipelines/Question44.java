package FunctionalProgramming.FunctionCompositionAndPipelines;

import java.util.function.Function;

public class Question44 {

    public static void main(String[] args) {

        Function<String, Integer> parse = Integer::parseInt;     // String → Integer
        Function<Integer, Integer> doubleIt = x -> x * 2;        // Integer → Integer


        Function<String, Integer> parseThenDouble = parse.andThen(doubleIt);
        System.out.println("andThen result: " + parseThenDouble.apply("10"));  // Output: 20


        Function<String, Integer> doubleAfterParse = doubleIt.compose(parse);
        System.out.println("compose result: " + doubleAfterParse.apply("10"));  // Output: 20
    }
}

