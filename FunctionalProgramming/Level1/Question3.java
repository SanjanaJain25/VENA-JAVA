package FunctionalProgramming.Level1;

import java.util.function.Consumer;

public class Question3 {
    public static void main(String[] args) {

        Consumer<String> printUppercase = str -> System.out.println(str.toUpperCase());


        printUppercase.accept("hello world");
    }
}

