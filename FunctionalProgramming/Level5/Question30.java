package FunctionalProgramming.Level5;
import java.util.*;
import java.util.stream.*;

class Order {
    String customerName;
    String status;
    double amount;

    Order(String customerName, String status, double amount) {
        this.customerName = customerName;
        this.status = status;
        this.amount = amount;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public double getAmount() {
        return amount;
    }
}


public class Question30 {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Sanjana", "COMPLETED", 250.0),
                new Order("Ranu", "PENDING", 150.0),
                new Order("Kratika", "COMPLETED", 100.0),
                new Order("Pragya", "CANCELLED", 200.0),
                new Order("Drashi", "COMPLETED", 300.0)
        );

        List<String> processedNames = orders.stream()
                .filter(order -> "COMPLETED".equals(order.getStatus()))
                .sorted(Comparator.comparingDouble(Order::getAmount))
                .map(Order::getCustomerName)
                .collect(Collectors.toList());

        System.out.println("Processed customer names: " + processedNames);
    }
}

