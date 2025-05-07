package FunctionalProgramming.Level1;

public class Question7 {
    public static void main(String[] args) {

        Runnable greet = () -> System.out.println("Hello Functional Java");

        greet.run();
    }
}
