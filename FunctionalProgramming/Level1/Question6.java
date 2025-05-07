package FunctionalProgramming.Level1;

import java.util.function.BiFunction;

public class Question6{
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;


        int result = add.apply(10, 20);

        System.out.println("Sum: " + result);
    }
}
