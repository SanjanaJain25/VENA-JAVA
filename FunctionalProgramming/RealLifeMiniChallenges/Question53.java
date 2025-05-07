package FunctionalProgramming.RealLifeMiniChallenges;

import java.util.*;
import java.util.stream.*;
import java.time.*;

public class Question53 {
    public static void main(String[] args) {

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 5, 1),
                LocalDate.of(2024, 1, 15),
                LocalDate.of(2022, 3, 20),
                LocalDate.of(2024, 8, 5)
        );


        Comparator<LocalDate> customComparator = Comparator.naturalOrder();


        Optional<LocalDate> earliestDate = dates.stream()
                .min(customComparator);


        Optional<LocalDate> latestDate = dates.stream()
                .max(customComparator);


        earliestDate.ifPresent(date -> System.out.println("Earliest date: " + date));
        latestDate.ifPresent(date -> System.out.println("Latest date: " + date));
    }
}

