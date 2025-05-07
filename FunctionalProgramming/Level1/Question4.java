package FunctionalProgramming.Level1;

import java.util.function.Supplier;

public class Question4 {
    public static void main(String[] args) {

        Supplier<Integer> random1to10 = () -> (int)(Math.random() * 10) + 1;


        int randomNumber = random1to10.get();
        System.out.println("Random number between 1 and 10: " + randomNumber);
    }
}
