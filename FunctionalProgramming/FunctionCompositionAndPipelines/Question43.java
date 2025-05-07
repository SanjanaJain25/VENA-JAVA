package FunctionalProgramming.FunctionCompositionAndPipelines;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question43 {


    public static <T, R> List<R> mapList(List<T> list, Function<T, R> mapper) {
        return list.stream()
                .map(mapper)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Java", "Stream", "Lambda");
        List<Integer> lengths = mapList(words, String::length);
        System.out.println("Word lengths: " + lengths);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> squares = mapList(numbers, n -> n * n);
        System.out.println("Squares: " + squares);
    }
}
