package FunctionalProgramming.AdvancedOptional;

import java.util.*;

public class Question48 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sanjana", "ranu", "kratika", "pragya");

        // Safely get the 3rd element (index 2)
        Optional<String> thirdElement = names.stream()
                .skip(2)
                .findFirst();

        // Print result
        thirdElement.ifPresentOrElse(
                name -> System.out.println("Third element: " + name),
                () -> System.out.println("List has less than 3 elements.")
        );
    }
}
