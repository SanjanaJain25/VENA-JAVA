package FunctionalProgramming.AdvancedOptional;

import java.time.LocalDate;
import java.util.*;

class Order2 {
    private int id;
    private LocalDate date;
    private double totalAmount;

    public Order2(int id, LocalDate date, double totalAmount) {
        this.id = id;
        this.date = date;
        this.totalAmount = totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}



public class Question50 {
    public static void main(String[] args) {
        List<Order2> orders = Arrays.asList(
                new Order2(1, LocalDate.of(2023, 12, 1), 250.0),
                new Order2(2, LocalDate.of(2024, 1, 15), 175.5),
                new Order2(3, LocalDate.of(2024, 2, 10), 400.0),
                new Order2(4, LocalDate.of(2024, 3, 5), 300.0)
        );

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 28);

        // Filter by date range, map to amount, sum
        double total = orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .mapToDouble(Order2::getTotalAmount)
                .sum();

        System.out.println("Total amount between " + startDate + " and " + endDate + " is: $" + total);
    }
}


