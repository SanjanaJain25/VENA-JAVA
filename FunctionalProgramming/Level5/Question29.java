package FunctionalProgramming.Level5;

import FunctionalProgramming.TriFunction;

public class Question29 {
    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> addThree =
                (a, b, c) -> a + b + c;

        int result = addThree.apply(10, 20, 30);
        System.out.println("Sum: " + result);  // Output: Sum: 60
    }
}
