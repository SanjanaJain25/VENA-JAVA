package FunctionalProgramming.CustomTypedAndNestedStreams;

import java.util.List;
import java.util.*;
import java.util.stream.*;


class Item1 {
    String name;
    double price;

    Item1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Order1 {
    List<Item1> items;

    Order1(List<Item1> items) {
        this.items = items;
    }

    public List<Item1> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.stream()
                .mapToDouble(Item1::getPrice)
                .sum();
    }
}

public class Question37 {
    public static void main(String[] args) {
        // Sample data
        List<Order1> orders = Arrays.asList(
                new Order1(Arrays.asList(new Item1("Apple", 2.5), new Item1("Banana", 1.2))),
                new Order1(Arrays.asList(new Item1("Laptop", 800), new Item1("Mouse", 20))),
                new Order1(Arrays.asList(new Item1("Book", 10), new Item1("Pen", 2)))
        );


        Optional<Order1> maxOrder = orders.stream()
                .max(Comparator.comparingDouble(Order1::getTotalPrice));

        maxOrder.ifPresent(order ->
                System.out.println("Order with max total: $" + order.getTotalPrice())
        );
    }
}
