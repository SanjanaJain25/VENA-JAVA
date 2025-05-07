package FunctionalProgramming.FunctionCompositionAndPipelines;

import java.util.function.Function;

public class Question41 {


    static Function<String, String> trim = String::trim;


    static Function<String, String> toLowerCase = String::toLowerCase;


    static Function<String, String> removePunctuation = s -> s.replaceAll("[\\p{Punct}]", "");


    static Function<String, String> cleanStringPipeline =
            trim.andThen(toLowerCase).andThen(removePunctuation);

    public static void main(String[] args) {
        String input = "  Hello, World! Welcome to Java.  ";
        String result = cleanStringPipeline.apply(input);

        System.out.println("Original: " + input);
        System.out.println("Cleaned: " + result);
    }
}
