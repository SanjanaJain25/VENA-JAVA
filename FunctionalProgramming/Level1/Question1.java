package FunctionalProgramming.Level1;
import java.util.function.Predicate;

public class Question1 {
    public static void main(String args[]){
        Predicate<String> startsithLetterA = x -> x.toUpperCase().charAt(0)== 'A';
        System.out.println(startsithLetterA.test("Aman"));
    }

}
